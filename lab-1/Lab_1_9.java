import java.util.Scanner;

public class Lab_1_9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.printf("input number for Array : ");
        int a = obj.nextInt();
        double[] num = new double[a];
        double sum = 0;
        for (int i = 0; i < a; i++) {
            num[i] = obj.nextDouble();
            sum += num[i] / a;
        }
        System.out.printf("Average : %f ", sum);
        obj.close();
    }
}
