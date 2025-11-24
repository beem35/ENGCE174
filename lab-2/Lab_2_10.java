import java.util.Scanner;

public class Lab_2_10 {
    static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

    }

    static class ShoppingCart {
        private Product[] items = new Product[10];
        private int itemCount = 0;

        public void addProduct(Product p) {
            this.items[this.itemCount] = p;
            this.itemCount++;
        }

        public double calculateTotalPrice() {
            double sum = 0;
            for (int i = 0; i <= this.itemCount - 1; i++) {
                sum += this.items[i].price;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Shopping list : ");
        int N = myScanner.nextInt();
        String name;
        double price;
        ShoppingCart shop = new ShoppingCart();
        for (int i = 0; i < N; i++) {
            myScanner.nextLine();
            System.out.printf("-----------------\n");
            System.out.printf("Name : ");
            name = myScanner.nextLine();
            System.out.printf("Price : ");
            price = myScanner.nextDouble();
            Product pro = new Product(name, price);
            shop.addProduct(pro);
        }
        System.out.printf("-----------------\n");
        System.out.printf("TotalPrice : %.2f",shop.calculateTotalPrice());
        myScanner.close();
        
    }
}
