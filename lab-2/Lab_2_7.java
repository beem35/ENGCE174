import java.util.Scanner;

public class Lab_2_7 {
    static class BankAccount {
        private String ownerName;
        private double balance;

        public BankAccount(String ownerName, double balance) {
            this.ownerName = ownerName;
            this.balance = balance;
        }

        public void withdraw(double amount) {
            if (amount <= this.balance) {
                this.balance -= amount;
                System.out.printf("Withdrawal successful.\n");
            } else {
                System.out.printf("Insufficient funds.\n");
            }
        }

        public void displayBalance() {
            System.out.println("Balance : " + this.balance);
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Name : ");
        String name = myScanner.nextLine();
        System.out.printf("Balan  : ");
        double balance = myScanner.nextDouble();
        BankAccount bAccount = new BankAccount(name, balance);
        System.out.printf("withdraw [1] : ");
        double amount1 = myScanner.nextDouble();
        System.out.printf("withdraw [2] : ");
        double amount2 = myScanner.nextDouble();
        bAccount.withdraw(amount1);
        bAccount.withdraw(amount2);
        bAccount.displayBalance();
        myScanner.close();
    }
}
