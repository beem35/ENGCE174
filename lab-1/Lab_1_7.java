import java.util.Scanner;

public class Lab_1_7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.printf("input number for loop : ");
        int N = obj.nextInt();
        int sum = 0;
        for (int j = 0; j < N; j++) {
            System.out.printf("input number [%d] : ",j+1);
            int num = obj.nextInt();
            sum += num;
        }
        System.out.printf("sum : %d", sum);
        obj.close();
    }
}
