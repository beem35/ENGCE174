import java.util.Scanner;

public class Lab_1_3 {

    public static void main(String[] args) {
        Scanner myodj = new Scanner(System.in);
        System.out.printf("input Number\n");
        int num = myodj.nextInt();
        if (num % 2 == 0) {
            System.out.printf("%d = Even",num);
        }else{
            System.out.printf("%d = Odd",num);
        }
        myodj.close();
    }
}