import java.util.Scanner;

public class Lab_1_8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.printf("input number of Array : ");
        int Array = obj.nextInt();
        int[] num = new int[Array];
        int max = -99999;
        for (int i = 0; i < Array; i++) {
            num[i] = obj.nextInt();
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.printf("Max : %d ", max);
        obj.close();
    }
}
