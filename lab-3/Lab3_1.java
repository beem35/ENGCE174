import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("UserName : ");
        String user = myScanner.nextLine();
        User u1 = new User(user);
        System.out.printf("Output : %s", u1.getUsername());
        myScanner.close();
    }
}

class User {
    private String username;

    public User(String user) {
        this.username = user;
    }

    public String getUsername() {
        return username;
    }
}