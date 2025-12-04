import java.util.Scanner;

public class Lab3_6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Balance : ");
        double bal = myScanner.nextDouble();
        System.out.printf("Deposit : ");
        double dep = myScanner.nextDouble();
        System.out.printf("Withdrawal : ");
        double with = myScanner.nextDouble();
        BankAccount_lab3 bAccount = new BankAccount_lab3(bal);
        bAccount.deposit(dep);
        bAccount.withdraw(with);
        System.out.printf("Final Balance : %.2f\n", bAccount.getBalance());
        myScanner.close();
    }
}
class BankAccount_lab3 {
    private double balance;

    public BankAccount_lab3(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
            System.out.printf("Deposit successful\n");
        } else {
            System.out.printf("Invalid deposit amount\n");
        }
    }

    public void withdraw(double amount) {
        if (amount >= 0) {
            if (amount <= this.balance) {
                this.balance -= amount;
                System.out.printf("Withdrawal successful\n");
            } else {
                System.out.printf("Invalid funds\n");
            }
        } else {
            System.out.printf("Invalid withdrawal amount\n");
        }
    }
}