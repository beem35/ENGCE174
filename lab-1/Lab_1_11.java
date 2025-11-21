import java.util.Scanner;

public class Lab_1_11 {
    public static int sumArray(int[] num) {
        Scanner myObj = new Scanner(System.in);
        int sum = 0;
        for (int j = 0; j < num.length; j++) {
            num[j] = myObj.nextInt();
            sum += num[j];
        }
        myObj.close();
        return sum;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int N = myObj.nextInt();
        int[] numArray = new int[N];

        System.out.printf("sum : %d ", sumArray(numArray));
        myObj.close();
    }
}
