import java.util.Scanner;

public class Lab3_9 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("minLength : ");
        int M = myScanner.nextInt();
        myScanner.nextLine();

        System.out.printf("user1 Name : ");
        String name1 = myScanner.nextLine();
        System.out.printf("user1 Password : ");
        String pass1 = myScanner.nextLine();

        System.out.printf("user2 Name : ");
        String name2 = myScanner.nextLine();
        System.out.printf("user2 Password : ");
        String pass2 = myScanner.nextLine();

        System.out.printf("minLength : ");
        int M2 = myScanner.nextInt();
        myScanner.nextLine();

        System.out.printf("user2 newPassword : ");
        String newpass2 = myScanner.nextLine();

        System.out.printf("--------------------\n");
        UserV3.setMinLength(M);
        UserV3 user1 = new UserV3(name1, pass1);
        UserV3 user2 = new UserV3(name2, pass2);
        UserV3.setMinLength(M2);
        user2.setPassword(newpass2);

        System.out.printf("--------------------\n");
        System.out.printf("User1 Password : %s\n", user1.getPassword());
        System.out.printf("User2 Password : %s\n", user2.getPassword());

        myScanner.close();
    }
}

class UserV3 {

    private String username;
    private String password;

    private static int minPasswordLength = 8;

    public UserV3(String username, String password) {
        this.username = username;
        if (password.length() >= minPasswordLength) {
            System.out.printf("Creation successful.\n");
            this.password = password;
        } else {
            System.out.printf("Creation failed.\n");
        }
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= minPasswordLength) {
            System.out.printf("Update successful.\n");
            this.password = newPassword;
        } else {
            System.out.printf("Update failed.\n");
        }
    }

    public static void setMinLength(int length) {
        if (length >= 4) {
            minPasswordLength = length;
            System.out.printf("New min length set to %d\n", length);
        } else {
            System.out.printf("Invalid length.\n");
        }
    }

    public static int getMinLength() {
        return minPasswordLength;
    }

    public String getUsername() {
        return this.username;
    }
}