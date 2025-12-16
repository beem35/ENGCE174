package lab5.lab5_12;

import java.util.Scanner;

public class Lab5_12 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Name : ");
        String name1 = myScanner.nextLine();
        System.out.print("Base Price : ");
        double price1 = myScanner.nextDouble();
        myScanner.nextLine();
        System.out.print("Name : ");
        String name2 = myScanner.nextLine();
        System.out.print("Base Price : ");
        double price2 = myScanner.nextDouble();
        System.out.print("PremiumRate : ");
        double premiumRate = myScanner.nextDouble();
        BasicService bService = new BasicService(name1, price1);
        PremiumService pService = new PremiumService(name2, price2, premiumRate);
        Service[] services = new Service[2];
        services[0] = bService;
        services[1] = pService;
        for (int i = 0; i < services.length; i++) {
            System.out.printf("%s Price: %.2f\n", services[i].name, services[i].calculateFinalPrice());
        }
        myScanner.close();
    }
}

class Service {
    protected String name;
    protected double basePrice;

    public Service(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double calculateFinalPrice() {
        return basePrice;
    }
}

class BasicService extends Service {
    public BasicService(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return this.basePrice * 1.05;
    }
}

class PremiumService extends Service {
    protected double premiumRate;

    public PremiumService(String name, double basePrice, double premiumRate) {
        super(name, basePrice);
        this.premiumRate = premiumRate;
    }

    @Override
    public double calculateFinalPrice() {
        return this.basePrice * (1 + this.premiumRate);
    }
}