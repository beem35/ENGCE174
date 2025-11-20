import java.util.Scanner;

public class Lab_1_2 {
    public static void main( String[] args ) {
        Scanner obj = new Scanner( System.in ) ;
        System.out.println( "enter num1 " ) ;
        double num1 = obj.nextDouble() ;
        System.out.println( "enter num2 ");
        double num2 = obj.nextDouble() ;
        double sum = num1 * num2 ;
        System.out.printf("sum: %.2f",sum) ;
        obj.close() ;
    }//end main
}//end Lab_1_2
