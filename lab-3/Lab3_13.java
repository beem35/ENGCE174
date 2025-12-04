import java.util.Scanner;

public class Lab3_13 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("loop for : ");
        int N = myScanner.nextInt();
        for (int i = 0; i < N; i++) {
            myScanner.nextLine();
            System.out.printf("Mode : ");
            String mode = myScanner.nextLine();
            if (mode.equalsIgnoreCase("set")) {
                System.out.printf("Set : ");
                int used = myScanner.nextInt();
                LicenseManager.setMax(used);
            } else if (mode.equalsIgnoreCase("checkout")) {
                LicenseManager.checkOut();
            } else if (mode.equalsIgnoreCase("checkin")) {
                LicenseManager.checkIn();
            } else if (mode.equalsIgnoreCase("status")) {
                LicenseManager.displayStatus();
            } else {
                System.out.printf("Mode Error\n");
            }
        }
        myScanner.close();
    }
}
class LicenseManager {
    private static int maxLicenses = 10;
    private static int usedLicenses = 0;
    public static void setMax(int max) {
        if (max > 0) {
            if (max > usedLicenses) {
                maxLicenses = max;
                System.out.printf("Max licenses set to %d\n", max);
            } else {
                System.out.printf(" Cannot set max lower than current usage.\n");
            }
        } else {
            System.out.printf("Invalid max value.\n");
        }
    }
    public static boolean checkOut() {
        if (usedLicenses < maxLicenses) {
            usedLicenses += 1;
            System.out.printf("Checkout successful.\n");
            return true;
        } else if (usedLicenses >= maxLicenses) {
            System.out.printf("Checkout failed: No licenses available.\n");
        }
        return false;
    }
    public static void checkIn() {
        if (usedLicenses > 0) {
            usedLicenses -= 1;
            System.out.printf("Check-in successful.\n");
        } else if (usedLicenses == 0) {
            System.out.printf("Nothing to check-in.\n");
        }
    }
    public static void displayStatus() {
        System.out.printf("Used : %d\n", usedLicenses);
        System.out.printf("Available : %d\n", maxLicenses - usedLicenses);
    }
}