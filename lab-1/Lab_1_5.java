import java.util.Scanner;

public class Lab_1_5 {
    public static void main( String[] args ) {
        Scanner obj = new Scanner( System.in ) ;
        System.out.printf( "\tMenu\n1: Americano\n2: Latte\n3: Espresso\n4: Mocha\n" ) ;
        int num = obj.nextInt() ;
        switch ( num ) {
            case 1 :
                System.out.printf( "Americano" ) ;
                break ;

            case 2 :
                System.out.printf( "Latte" ) ;
                break;

            case 3 :
                System.out.printf( "Espresso" ) ;
                break ;

            case 4 :
                System.out.printf( "Mocha" ) ;
                break ;
        
            default :
                System.out.printf( "Invalid Menu" ) ;
                break ;
        }//end swich case
        obj.close() ;
    }//end main
}//end Lab_1_5
