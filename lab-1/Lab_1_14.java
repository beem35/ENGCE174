import java.util.Scanner;

public class Lab_1_14 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int R = myScanner.nextInt();
        int C = myScanner.nextInt();

        char[][] dashBoard = new char[R][C];
        int[][] mine = new int[R][C];
        int count = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                String str = myScanner.next();
                dashBoard[i][j] = str.charAt(0);
                mine[i][j] = (dashBoard[i][j] == '*') ? 1 : 0;
            }
        }

        int targetR = myScanner.nextInt();
        int targetC = myScanner.nextInt();
        count = checkMine(mine, targetR, targetC, R, C);

        if (mine[targetR][targetC] == 1) {
            System.out.printf("mine");
        } else {
            System.out.printf("%d", count);
        }
        myScanner.close();

    }

    public static int checkMine(int[][] mine, int targetR, int targetC, int R, int C) {
        int[] dr = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dc = { -1, 0, 1, -1, 1, -1, 0, 1 };
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int newR = targetR + dr[i];
            int newC = targetC + dc[i];
            if (0 <= newR && newR < R && 0 <= newC && newC < C) {
                if (mine[newR][newC] == 1) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
