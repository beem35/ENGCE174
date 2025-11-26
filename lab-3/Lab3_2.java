import java.util.Scanner;

public class Lab3_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("initial Score : ");
        int num1 = myScanner.nextInt();
        System.out.printf("New Score : ");
        int num2 = myScanner.nextInt();
        Player play = new Player(num1);
        play.setScore(num2);
        System.out.printf("Output : %d", play.getScore());
        myScanner.close();
    }
}

class Player {
    private int score;

    Player(int initialScore) {
        this.score = initialScore;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        this.score = newScore;
    }
}