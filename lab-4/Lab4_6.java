import java.util.Scanner;

public class Lab4_6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("X: ");
        int x = myScanner.nextInt();
        System.out.printf("Y: ");
        int y = myScanner.nextInt();
        System.out.printf("Move X: ");
        int dx = myScanner.nextInt();
        System.out.printf("Move Y: ");
        int dy = myScanner.nextInt();
        Point p1 = new Point(x, y);
        Point p2 = p1.move(dx, dy);
        Point p3 = p2.move(dx, dy);
        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
        myScanner.close();
    }
}

class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Point move(int dx, int dy) {
        return new Point(this.x + dx, this.y + dy);
    }

    public void displayInfo() {
        System.out.printf("(%d, %d)\n", getX(), getY());
    }
}