import java.util.Scanner;

public class Lab_2_6 {
    

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Name : ");
        String name = myScanner.nextLine();
        System.out.printf("Balance : ");
        double money = myScanner.nextDouble();
        System.out.printf("Amount : ");
        double amount = myScanner.nextDouble();
        BankAccount a1 = new BankAccount(name, money);
        a1.deposit(amount);
        a1.displaySummary();
        myScanner.close();
    }
}
class BankAccount {
        private String ownerName;
        private double balance;

        public BankAccount(String ownerName, double balance) {
            this.ownerName = ownerName;
            this.balance = balance;
        }

        public void deposit(double amount) {
            this.balance += amount;
        }

        public void displaySummary() {
            System.out.printf("----------------\n", ownerName);
            System.out.printf("Owner : %s\n", ownerName);
            System.out.printf("Balance : %.2f", balance);
        }
    }
