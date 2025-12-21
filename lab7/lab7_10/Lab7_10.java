package lab7.lab7_10;

import java.util.Scanner;

public class Lab7_10 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Weight: ");
        double weight1 = myScanner.nextDouble();
        System.out.print("Mode: ");
        int mode1 = myScanner.nextInt();
        System.out.print("Weight: ");
        double weight2 = myScanner.nextDouble();
        System.out.print("Mode: ");
        int mode2 = myScanner.nextInt();
        StandardShipping standard = new StandardShipping();
        ExpressShipping express = new ExpressShipping();
        ShippingCostCalculator shipping1 = new ShippingCostCalculator((mode1 == 1) ? standard : express);
        double sum1 = shipping1.calculateTotal(weight1);
        ShippingCostCalculator shipping2 = new ShippingCostCalculator((mode2 == 1) ? standard : express);
        double sum2 = shipping2.calculateTotal(weight2);
        System.out.println("Cost: " + sum1);
        System.out.println("Cost: " + sum2);
        myScanner.close();
    }
}

interface IShippingStrategy {
    double calculate(double weight);
}

class StandardShipping implements IShippingStrategy {
    @Override
    public double calculate(double weight) {

        return weight * 5;
    }
}

class ExpressShipping implements IShippingStrategy {
    @Override
    public double calculate(double weight) {

        return (weight * 10) + 50;
    }
}

class ShippingCostCalculator {
    private IShippingStrategy strategy;

    public ShippingCostCalculator(IShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateTotal(double weight) {

        return strategy.calculate(weight);
    }
}