import java.util.Scanner;

public class Lab_1_1 {
    public static void main( String[] args ) {
        Scanner myObj = new Scanner( System.in ) ; // Scanner of input data

        int numberInput_1 = myObj.nextInt() ; // input num1
        int numberInput_2 = myObj.nextInt() ; // input num2

        System.out.println( numberInput_1 + numberInput_2 ) ; // output

        myObj.close() ; // close input data

    }//end main
}//end Lab_1_1
