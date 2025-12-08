package lab4_3;
import java.util.Scanner;

public class Lab4_3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Mode : ");
        int mode = myScanner.nextInt();
        myScanner.nextLine();
        if (mode == 1) {
            PlayerV2 play = new PlayerV2();
            play.displayProfile();
        } else if (mode == 2) {
            System.out.printf("Name : ");
            String name = myScanner.nextLine();
            System.out.printf("Level : ");
            int level = myScanner.nextInt();
            PlayerV2 play = new PlayerV2(name, level);
            play.displayProfile();
        } else {
            System.out.printf("Error mode");
        }
        myScanner.close();
    }
}

class PlayerV2 {
    
    private String username;
    private int level;

    
    public PlayerV2() {
        this("Guest", 1);
    }

    
    public PlayerV2(String username, int level) {
        this.username = username;
        this.level = level;
    }

    
    public void displayProfile() {
        System.out.printf("User: %s, Level: %d\n", this.username, this.level);
    }
}