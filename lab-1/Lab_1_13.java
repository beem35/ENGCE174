import java.util.Scanner;

public class Lab_1_13 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int R = myScanner.nextInt();
        int C = myScanner.nextInt();

        int[][] dashBoard = new int[R][C];
        int count = 0;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                dashBoard[i][j] = myScanner.nextInt();
                if (dashBoard[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.printf("จำนวนเซิร์ฟเวอร์ที่ Online : %d", count);
        myScanner.close();
    }
}
