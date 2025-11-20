import java.util.Scanner;

public class Lab_1_4 {
    public static void main(String[] args) {
        Scanner myodj = new Scanner(System.in);
        System.out.printf("input your score : ");
        int score = myodj.nextInt();
        if ( score >= 80 && score <= 100 ) {
            System.out.printf("A");
        }else if ( score >= 70 && score <= 79 ) {
            System.out.printf("B");
        }else if ( score >= 60 && score <= 69 ) {
            System.out.printf("C");
        }else if ( score >= 50 && score <= 59 ) {
            System.out.printf("D");
        }else if ( score >= 0 && score <= 49 ) {
            System.out.printf("F");
        }else {
            System.out.printf("Error");
        }
        myodj.close();
    }
}
