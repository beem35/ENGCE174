package lab7.lab7_8;

import java.util.Scanner;

public class Lab7_8 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Amount: ");
        double amount1 = myScanner.nextDouble();
        System.out.print("Amount: ");
        double amount2 = myScanner.nextDouble();
        CashPayment cash = new CashPayment();
        CreditCardPayment credit = new CreditCardPayment();
        PaymentProcessor.processPayment(cash, amount1);
        PaymentProcessor.processPayment(credit, amount2);
        myScanner.close();
    }
}

interface IPayable {
    double calculateTotal(double originalAmount);
}

class CashPayment implements IPayable {
    @Override
    public double calculateTotal(double originalAmount) {

        return originalAmount;
    }
}

class CreditCardPayment implements IPayable {
    private static final double FEE_RATE = 0.03;

    @Override
    public double calculateTotal(double originalAmount) {

        return originalAmount + (originalAmount * FEE_RATE);
    }
}

class PaymentProcessor {
    public static void processPayment(IPayable paymentMethod, double amount) {
        double finalAmount = paymentMethod.calculateTotal(amount);

        String type = paymentMethod.getClass().getSimpleName();
        System.out.println("Payment Type: " + type + ", Final Amount: " + finalAmount);
    }
}