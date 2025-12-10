package lab5_9;

import java.util.Scanner;

public class Lab5_9 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Name : ");
        String name1 = myScanner.nextLine();
        System.out.print("Unit Price : ");
        double unitprice = myScanner.nextDouble();
        System.out.print("Quantity : ");
        int quantity = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("Name : ");
        String name2 = myScanner.nextLine();
        System.out.print("Monthly Cost : ");
        double monthlyCost = myScanner.nextDouble();
        System.out.print("Months : ");
        int months = myScanner.nextInt();
        PhysicalProduct phy = new PhysicalProduct(name1, unitprice, quantity);
        DigitalSubscription dig = new DigitalSubscription(name2, monthlyCost, months);
        Item[] item = new Item[2];
        item[0] = phy;
        item[1] = dig;
        double sum = 0;
        for (int i = 0; i < 2; i++) {
            sum += item[i].getValue();
        }
        System.out.printf("Sum: %.2f \n", sum);
        myScanner.close();
    }
}

class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public double getValue() {
        return 0.0;
    }
}

class PhysicalProduct extends Item {
    protected double unitPrice;
    protected int quantity;

    public PhysicalProduct(String name, double unitPrice, int quantity) {
        super(name);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public double getValue() {
        return unitPrice * quantity;
    }
}

class DigitalSubscription extends Item {
    protected double monthlyCost;
    protected int months;

    public DigitalSubscription(String name, double monthlyCost, int months) {
        super(name);
        this.monthlyCost = monthlyCost;
        this.months = months;
    }

    @Override
    public double getValue() {
        return monthlyCost * months;
    }
}
