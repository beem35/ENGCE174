import java.util.Scanner;

public class Lab3_10 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("loop : ");
        int N = myScanner.nextInt();
        int set;
        for (int i = 0; i < N; i++) {
            myScanner.nextLine();
            System.out.printf("Mode : ");
            String mode = myScanner.nextLine();
            if (mode.equalsIgnoreCase("set")) {
                System.out.printf("SET : ");
                set = myScanner.nextInt();
                SystemLogger.setLogLevel(set);
            } else if (mode.equalsIgnoreCase("log")) {
                System.out.printf("LOG : ");
                set = myScanner.nextInt();
                myScanner.nextLine();
                System.out.printf("Message : ");
                String message = myScanner.nextLine();
                SystemLogger.log(set, message);
            }
        }
        myScanner.close();
    }
}

class SystemLogger {

    private static int currentLogLevel = 1;

    private static String getLevelName(int level) {
        if (level == 1) {
            return "INFO";
        } else if (level == 2) {
            return "DEBUG";
        } else if (level == 3) {
            return "ERROR";
        } else {
            return "UNKNOWN";
        }
    }

    public static void setLogLevel(int newLevel) {
        if (newLevel <= 3 && newLevel >= 1) {
            currentLogLevel = newLevel;
            System.out.printf("Loglevel set to %s\n", getLevelName(newLevel));
        } else {
            System.out.printf("Invalid log level.\n");
        }
    }

    public static void log(int messageLevel, String message) {
        if (messageLevel >= currentLogLevel) {
            System.out.printf("[%s]: %s\n", getLevelName(messageLevel), message);
        }

    }
}