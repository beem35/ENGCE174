package lab4_2;
import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Mode : ");
        int mode = myScanner.nextInt();
        myScanner.nextLine();
        if (mode == 1) {
            System.out.printf("Name : ");
            String name = myScanner.nextLine();
            ProductV3 pro = new ProductV3(name);
            pro.displayInfo();
        } else if (mode == 2) {
            System.out.printf("Name : ");
            String name = myScanner.nextLine();
            System.out.printf("Price : ");
            double price = myScanner.nextDouble();
            ProductV3 pro = new ProductV3(name, price);
            pro.displayInfo();
        } else {
            System.out.printf("Error mode");
        }
        myScanner.close();
    }
}

class ProductV3 {

    private String name;
    private double price;

    public ProductV3(String name) {
        this(name, 0.0);
    }

    public ProductV3(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.printf("Product: %s, Price: %.2f\n", this.name, this.price);
    }
}