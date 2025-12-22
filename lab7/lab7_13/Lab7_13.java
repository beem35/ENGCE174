package lab7.lab7_13;

import java.util.Scanner;

public class Lab7_13 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Version1: ");
        String version1 = myScanner.nextLine();
        System.out.print("Version2: ");
        String version2 = myScanner.nextLine();
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();
        config1.updateVersion(version1);
        config2.updateVersion(version2);
        System.out.printf("Version: %s\n", config1.getVersion());
        System.out.printf("Version: %s\n", config2.getVersion());
        myScanner.close();
    }
}

class ConfigurationManager {
    private static ConfigurationManager instance;
    private String version;

    private ConfigurationManager() {
        this.version = "V1.0";
        System.out.printf("Configuration object created.\n");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getVersion() {
        return version;
    }

    public void updateVersion(String newVersion) {
        this.version = newVersion;
    }
}