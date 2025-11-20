import java.util.Scanner;

public class Lab_1_10 {
    public double calculateArea(double width,double height){
        return width*height   ;
    }
    public static void main(String[] args) {
        Scanner odj = new Scanner(System.in) ;
        double a = odj.nextDouble();
        double b = odj.nextDouble();
        Lab_1_10 myodj = new Lab_1_10();
        System.out.println("Sum : "+ myodj.calculateArea(a,b));
        odj.close();
    }
}
