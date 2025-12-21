package lab7.lab7_2;

import java.util.Scanner;

public class Lab7_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Price: ");
        double price = myScanner.nextDouble();
        System.out.print("Mode: ");
        int mode = myScanner.nextInt();
        DiscountPolicy dPolicy;
        double sum;
        if (mode == 1) {
            dPolicy = new StandardDiscount();
            sum = dPolicy.applyDiscount(price);
            System.out.printf("Price: %.2f\n", sum);
        } else if (mode == 2) {
            dPolicy = new StandardDiscount();
            sum = dPolicy.applyDiscount(price);
            System.out.printf("Price: %.2f\n", sum);
        } else {
            System.out.println("Error Mode.");
        }
        myScanner.close();
    }
}

abstract class DiscountPolicy {
    public abstract double applyDiscount(double originalPrice);
}

class StandardDiscount extends DiscountPolicy {
    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice - (originalPrice * 0.10);
    }
}

class VIPDiscount extends DiscountPolicy {
    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice - (originalPrice * 0.20);
    }
}