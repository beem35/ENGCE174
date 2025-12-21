package lab7.lab7_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lav7_5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Name: ");
        String name1 = myScanner.nextLine();
        System.out.printf("Price: ");
        double price1 = myScanner.nextDouble();
        myScanner.nextLine();
        System.out.printf("Name: ");
        String name2 = myScanner.nextLine();
        System.out.printf("Price: ");
        double price2 = myScanner.nextDouble();
        Order order = new Order();
        order.createAndAddItem(name1, price1);
        order.createAndAddItem(name2, price2);
        System.out.printf("All Price: %.2f \n", order.calculateTotal());
        myScanner.close();
    }
}

class LineItem {
    protected String productName;
    protected double price;

    public LineItem(String name, double price) {
        this.productName = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private java.util.ArrayList<LineItem> items;

    public Order() {
        this.items = new ArrayList<LineItem>();
    }

    public void createAndAddItem(String productName, double price) {
        LineItem lItem = new LineItem(productName, price);
        this.items.add(lItem);
    }

    public double calculateTotal() {
        double sum = 0;
        for (int i = 0; i < this.items.size(); i++) {
            sum += this.items.get(i).getPrice();
        }
        return sum;
    }
}