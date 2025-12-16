package lab6_3;

import java.util.Scanner;

public class Lab6_3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.printf("Book Name : ");
        String name = myScanner.nextLine();

        System.out.printf("Book price : ");
        double price = myScanner.nextDouble();

        Book book = new Book(name, price);
        System.out.printf("Price: %.2f\n", book.calculateFinalPrice());
        myScanner.close();
    }
}

interface ITaxble {
    public double getTaxRate();
}

abstract class Product implements ITaxble {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calculateBasePrice() {
        return this.price;
    }

    public abstract double calculateFinalPrice();
}

class Book extends Product {

    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public double getTaxRate() {
        return 0.07;
    }

    @Override
    public double calculateFinalPrice() {
        return (calculateBasePrice() + (calculateBasePrice() * getTaxRate()));
    }
}