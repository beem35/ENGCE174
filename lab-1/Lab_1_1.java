import java.util.Scanner;

public class Lab_1_1 {
    public static void main( String[] args ) {
        Scanner obj = new Scanner( System.in ) ;
        int num1 = obj.nextInt() ;
        int num2 = obj.nextInt() ;
        int sum = num1 + num2 ;
        System.out.println( sum ) ;
        obj.close() ;
    }//end main
}//end Lab_1_1
