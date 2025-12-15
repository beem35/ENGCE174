package lab6_4;

import java.util.Scanner;

public class Lab6_4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Profile : ");
        String pro = myScanner.nextLine();
        System.out.printf("User Id : ");
        String id = myScanner.nextLine();
        DefaultLoader loader = new DefaultLoader(pro);
        UserLoader user = new UserLoader(id);
        IConfigLoader[] config = new IConfigLoader[2];
        config[0] = loader;
        config[1] = user;
        for (int i = 0; i < config.length; i++) {
            config[i].loadConfig();
        }
        myScanner.close();
    }
}

interface IConfigLoader {
    public void loadConfig();
}

class DefaultLoader implements IConfigLoader {
    protected String defaultProfile;

    public DefaultLoader(String defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    @Override
    public void loadConfig() {
        System.out.printf("Loading Default Profile: %s \n", this.defaultProfile);
    }
}

class UserLoader implements IConfigLoader {
    protected String userId;

    public UserLoader(String id) {
        this.userId = id;
    }

    @Override
    public void loadConfig() {
        System.out.printf("Loading User Profile for ID: %s \n", this.userId);
    }
}