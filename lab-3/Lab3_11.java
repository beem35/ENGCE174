import java.util.Scanner;

public class Lab3_11 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("for loop : ");
        int N = myScanner.nextInt();
        for (int i = 0; i < N; i++) {
            myScanner.nextLine();
            System.out.printf("Mode : ");
            String mode = myScanner.nextLine();
            if (mode.equalsIgnoreCase("set_url")) {
                System.out.printf("URL : ");
                String url = myScanner.nextLine();
                SystemConfig config = SystemConfig.getInstance();
                config.setServerUrl(url);
            } else if (mode.equalsIgnoreCase("set_max")) {
                System.out.printf("Max : ");
                int count = myScanner.nextInt();
                SystemConfig config = SystemConfig.getInstance();
                config.setMaxConnections(count);
            } else if (mode.equalsIgnoreCase("show")) {
                SystemConfig config = SystemConfig.getInstance();
                System.out.printf("URL : %s\n", config.getServerUrl());
                System.out.printf("Max : %d\n", config.getMaxConnections());
            } else {
                System.out.printf("Error Mode\n");
            }
        }
        myScanner.close();
    }
}
class SystemConfig {
    private static SystemConfig instance;
    private String serverUrl;
    private int maxConnections;
    private SystemConfig() {
        this.serverUrl = "default.server.com";
        this.maxConnections = 10;
    }
    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }
    public String getServerUrl() {
        return this.serverUrl;
    }
    public void setServerUrl(String url) {
        if (url == null || url.isEmpty()) {
            System.out.println("Error: URL is Empty");
        }
        this.serverUrl = url;
    }
    public int getMaxConnections() {
        return this.maxConnections;
    }
    public void setMaxConnections(int count) {
        if (count > 0) {
            this.maxConnections = count;
        } else {
            System.out.printf("Invalid count.\n");
        }
    }
}