package lab5.lab5_14;

import java.util.Scanner;

public class Lab5_14 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("ID : ");
        String id1 = myScanner.nextLine();
        System.out.printf("Fee : ");
        double fee1 = myScanner.nextDouble();
        myScanner.nextLine();
        System.out.printf("ID : ");
        String id2 = myScanner.nextLine();
        System.out.printf("Fee : ");
        double fee2 = myScanner.nextDouble();
        System.out.printf("Insurance Fee : ");
        double infee = myScanner.nextDouble();
        StandardShipping sShipping = new StandardShipping(id1, fee1);
        PremiumShipping pShipping = new PremiumShipping(id2, fee2, infee);
        Shipping[] shippings = new Shipping[2];
        shippings[0] = sShipping;
        shippings[1] = pShipping;
        for (int i = 0; i < shippings.length; i++) {
            System.out.printf("%s TotalFee: %.2f \n", shippings[i].trackingId, shippings[i].calculateTotalFee());
        }
        myScanner.close();
    }
}

class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String trackingId, double baseFee) {
        this.trackingId = trackingId;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() {
        return baseFee;
    }
}

class StandardShipping extends Shipping {
    public StandardShipping(String id, double baseFee) {
        super(id, baseFee);
    }

    @Override
    public double calculateTotalFee() {

        return this.baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String id, double baseFee, double insuranceFee) {
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        double baseFee = super.calculateTotalFee();
        return baseFee + this.insuranceFee;
    }
}