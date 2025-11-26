import java.util.Scanner;

public class Lab_2_8 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Mode : ");
        String mode = myScanner.nextLine();
        System.out.printf("Temp : ");
        double temp = myScanner.nextDouble();
        if (mode.equalsIgnoreCase("C_TO_F")) {
            System.out.printf("F : %.1f", TempConverter.celsiusToFahrenheit(temp));
        } else if (mode.equalsIgnoreCase("F_TO_C")) {
            System.out.printf("C : %.1f", TempConverter.fahrenheitToCelsius(temp));
        } else {
            System.out.printf("Input Mode : Error ");
        }
        myScanner.close();
    }
}

class TempConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
