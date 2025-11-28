import java.util.Scanner;

public class Lab3_3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Password : ");
        String pass1 = myScanner.nextLine();
        System.out.printf("newPassword : ");
        String pass2 = myScanner.nextLine();
        UserV2 pass = new UserV2(pass1);
        pass.setPassword(pass2);
        System.out.printf("Output : %s", pass.getPassword());
        myScanner.close();
    }
}

class UserV2 {
    private String password;

    UserV2(String initialPassword) {
        this.password = initialPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        int length = newPassword.length();

        if (length >= 8) {
            this.password = newPassword;
            System.out.printf("Password updated.\n");
        } else {
            System.out.printf("Password is too short.\n");
        }
    }
}