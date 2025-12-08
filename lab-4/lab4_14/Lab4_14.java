package lab4_14;
import java.util.Scanner;

public class Lab4_14 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Name Game : ");
        String nameGame = myScanner.nextLine();
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Scores [%d] : ", i + 1);
            array[i] = myScanner.nextInt();
        }
        ScoreBoard sb1 = new ScoreBoard(nameGame, array);
        ScoreBoard sb2 = new ScoreBoard(sb1);
        System.out.printf("Fix Scores [1] : ");
        array[0] = myScanner.nextInt();
        sb1.displayScores();
        sb2.displayScores();
        myScanner.close();
    }
}

class ScoreBoard {

    private final String gameName;
    private final int[] scores;

    public ScoreBoard(String gameName, int[] scores) {
        this.gameName = gameName;
        this.scores = scores;
    }

    public ScoreBoard(ScoreBoard other) {
        this.gameName = other.gameName;
        this.scores = new int[other.scores.length];
        for (int i = 0; i < other.scores.length; i++) {
            this.scores[i] = other.scores[i];
        }
    }

    public void displayScores() {
        System.out.printf("%s: %d, %d, %d\n", this.gameName, this.scores[0], this.scores[1], this.scores[2]);
    }
}