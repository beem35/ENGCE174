import java.util.Scanner;

public class Lab3_15 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Username : ");
        String name = myScanner.nextLine();
        UserV4 user = new UserV4(name);
        System.out.printf("loop for : ");
        int N = myScanner.nextInt();
        for (int i = 0; i < N; i++) {
            myScanner.nextLine();
            System.out.printf("Mode : ");
            String mode = myScanner.nextLine();
            if (mode.equalsIgnoreCase("set_policy")) {
                System.out.printf("Max : ");
                int max = myScanner.nextInt();
                UserV4.setPolicy(max);
            } else if (mode.equalsIgnoreCase("login")) {
                System.out.printf("Password : ");
                String pass = myScanner.nextLine();
                user.login(pass);
            } else {
                System.out.printf("Mode Error\n");
            }
        }
        myScanner.close();
    }
}
class UserV4 {
    private String username;
    private int failedAttempts;
    private boolean isLocked;
    private static int maxAttempts = 3;
    public UserV4(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }
    public String getUsername() {
        return this.username;
    }
    public boolean isLocked() {
        return isLocked;
    }
    public int getFailedAttempts() {
        return failedAttempts;
    }
    public static void setPolicy(int max) {
        if (max > 0) {
            maxAttempts = max;
        } else {
            System.out.printf("Invalid policy\n");
        }
    }
    public void login(String password) {
        if (isLocked == true) {
            System.out.printf("Account is locked.\n");
        } else if (isLocked == false && password.equals("pass123")) {
            System.out.printf("Login successful.\n");
            failedAttempts = 0;
        } else {
            System.out.printf("Login successful.\n");
            failedAttempts += 1;
            if (failedAttempts >= maxAttempts) {
                isLocked = true;
                System.out.printf("Login failed : Account locked.\n");
            } else {
                System.out.printf("Login failed : %d attempts left.\n", maxAttempts - failedAttempts);
            }
        }
    }
}