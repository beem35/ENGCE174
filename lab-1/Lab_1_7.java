import java.util.Scanner;

public class Lab_1_7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.printf("input number for loop : ");
        int i = obj.nextInt();
        int sum = 0;
        for (int j = 0; j < i; j++) {
            int num = obj.nextInt();
            sum += num;
        }
        System.out.printf("%d", sum);
        obj.close();
    }
}
