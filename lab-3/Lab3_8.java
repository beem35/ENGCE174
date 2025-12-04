import java.util.Scanner;

public class Lab3_8 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Product Name : ");
        String name = myScanner.nextLine();
        System.out.printf("Stock : ");
        int st = myScanner.nextInt();
        InventoryItem item = new InventoryItem(name, st);
        System.out.printf("loop : ");
        int n = myScanner.nextInt();
        for (int i = 0; i < n; i++) {
            myScanner.nextLine();
            System.out.printf("Mode : ");
            String mode = myScanner.nextLine();
            if (mode.equalsIgnoreCase("add")) {
                System.out.printf("Add : ");
                st = myScanner.nextInt();
                item.addStock(st);
            } else if (mode.equalsIgnoreCase("sell")) {
                System.out.printf("Sell : ");
                st = myScanner.nextInt();
                item.sellStock(st);
            } else {
                System.out.printf("Error Mode\n");
            }
        }
        System.out.printf("Final Stock : %d", item.getStock());
        myScanner.close();
    }
}

class InventoryItem {
    private String productName;
    private int stock;
    public InventoryItem(String productName, int initialStock) {
        this.productName = productName;
        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
    }
    public String getProductName() {
        return this.productName;
    }
    public int getStock() {
        return this.stock;
    }
    public void addStock(int amount) {
        if (amount > 0) {
            System.out.printf("Stock added.\n");
            this.stock += amount;
        } else {
            System.out.printf("Invalid amount.\n");
        }
    }
    public void sellStock(int amount) {
        if (amount > 0) {
            if (amount <= stock) {
                this.stock -= amount;
                System.out.printf("Sale successful.\n");
            } else {
                System.out.printf("Not enough stock.\n");
            }
        } else {
            System.out.printf("Invalid amount.\n");
        }
    }
}