import java.util.Scanner;

public class Lab_1_1 {
    public static void main( String[] args ) {
        Scanner obj = new Scanner( System.in ) ;
        System.out.println( "enter num1 " ) ;
        int num1 = obj.nextInt() ;
        System.out.println( "enter num2 " );
        int num2 = obj.nextInt() ;
        int sum = num1 + num2 ;
        System.out.println( "sum: " + sum ) ;
        obj.close() ;
    }//end main
}//end Lab_1_1
