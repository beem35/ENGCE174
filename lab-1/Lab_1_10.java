import java.util.Scanner;

public class Lab_1_10 {
    public static double calculateArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner odj = new Scanner(System.in);
        double a = odj.nextDouble();
        double b = odj.nextDouble();
        System.out.println("Sum : " + calculateArea(a, b));
        odj.close();
    }
}
