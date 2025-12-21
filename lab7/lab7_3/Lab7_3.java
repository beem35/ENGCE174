package lab7.lab7_3;

import java.util.Scanner;

public class Lab7_3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Income: ");
        double income = myScanner.nextDouble();
        System.out.print("Mode: ");
        int mode = myScanner.nextInt();
        ITaxCalculator tax;
        double amount;
        if (mode == 1) {
            tax = new FlatTax();
            amount = tax.calculateTax(income);
            System.out.printf("Tax Due: %.2f\n", amount);
        } else if (mode == 2) {
            tax = new NoTax();
            amount = tax.calculateTax(income);
            System.out.printf("Tax Due: %.2f\n", amount);
        } else {
            System.out.println("Error Mode.");
        }
        myScanner.close();
    }
}

interface ITaxCalculator {
    double calculateTax(double income);
}

class FlatTax implements ITaxCalculator {
    @Override
    public double calculateTax(double income) {

        return income * 0.10;
    }
}

class NoTax implements ITaxCalculator {
    @Override
    public double calculateTax(double income) {

        return 0.0;
    }
}