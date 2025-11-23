import java.util.Scanner;

public class Lab_2_5 {
    static class Rectangle {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.height = height;
            this.width = width;
        }

        public double getArea() {
            return this.width * this.height;
        }

        public double getPerimeter() {
            return 2 * (this.width + this.height);
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("input your width : ");
        double num1 = myScanner.nextDouble();
        System.out.printf("input your height : ");
        double num2 = myScanner.nextDouble();
        Rectangle rec = new Rectangle(num1, num2);
        System.out.printf("Area : %.2f \n", rec.getArea());
        System.out.printf("Perimeter : %.2f ", rec.getPerimeter());
        myScanner.close();
    }
}
