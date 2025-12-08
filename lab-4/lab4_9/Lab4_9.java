package lab4_9;
import java.util.Scanner;

public class Lab4_9 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("ID : ");
        String id = myScanner.nextLine();
        System.out.printf("Balance : ");
        double amount = myScanner.nextDouble();
        System.out.printf("Deposit : ");
        double dep = myScanner.nextDouble();
        System.out.printf("Withdraw : ");
        double wit = myScanner.nextDouble();
        ImmutableAccount acc1 = new ImmutableAccount(id, amount);
        ImmutableAccount acc2 = acc1.deposit(dep);
        ImmutableAccount acc3 = acc2.withdraw(wit);
        acc1.displayInfo();
        acc3.displayInfo();
        myScanner.close(); 
    }
}

class ImmutableAccount {

    private final String accountId;
    private final double balance;

    public ImmutableAccount(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = (balance > 0) ? balance : 0;
    }

    public ImmutableAccount(ImmutableAccount other) {
        this.accountId = other.accountId;
        this.balance = other.balance;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public double getBalance() {
        return this.balance;
    }

    public ImmutableAccount deposit(double amount) {
        if (amount > 0) {
            return new ImmutableAccount(this.accountId, this.balance + amount);
        } else if (amount <= 0) {
            System.out.printf("Invalid deposit amount.\n");
        }
        return this;
    }

    public ImmutableAccount withdraw(double amount) {
        if (amount > 0) {
            if (amount < balance) {
                return new ImmutableAccount(this.accountId, this.balance - amount);
            } else {
                System.out.printf("Insufficient funds.\n");
            }
        } else {
            System.out.printf("Invalid withdrawal amount.\n");
        }
        return this;
    }

    public void displayInfo() {
        System.out.printf("ID : %s, Balance: %.1f\n", getAccountId(), getBalance());
    }
}