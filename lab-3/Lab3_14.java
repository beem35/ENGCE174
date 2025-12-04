import java.util.Scanner;

public class Lab3_14 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("loop for : ");
        int N = myScanner.nextInt();
        BankAccountV5 myacc = null;
        for (int i = 0; i < N; i++) {
            myScanner.nextLine();
            System.out.printf("Mode : ");
            String mode = myScanner.nextLine();
            if (mode.equalsIgnoreCase("create")) {
                System.out.printf("Balance : ");
                double balance = myScanner.nextDouble();
                myacc = new BankAccountV5(balance);
            } else if (mode.equalsIgnoreCase("deposit")) {
                System.out.printf("Deposit : ");
                double dep = myScanner.nextDouble();
                if (myacc == null) {
                    System.out.printf("No account exists.\n");
                } else {
                    myacc.deposit(dep);
                }
            } else if (mode.equalsIgnoreCase("withdraw")) {
                System.out.printf("Withdraw : ");
                double draw = myScanner.nextDouble();
                if (myacc == null) {
                    System.out.printf("No account exists.\n");
                } else {
                    myacc.withdraw(draw);
                }
            } else if (mode.equalsIgnoreCase("status")) {
                if (myacc == null) {
                    System.out.printf("No account exists.\n");
                } else {
                    System.out.printf("Balance : %.2f\n", myacc.getBalance());
                }
            } else if (mode.equalsIgnoreCase("global_status")) {
                System.out.printf("Total Transactions : %d\n", BankAccountV5.getTotalTransactionCount());
            } else {
                System.out.printf("Mode Error\n");
            }
        }
        myScanner.close();
    }
}
class BankAccountV5 {
    private double balance;
    private static int totalTransactionCount = 0;
    public BankAccountV5(double initialDeposit) {
        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        } else {
            this.balance = 0;
        }
        totalTransactionCount = 0;
        System.out.printf("Account created.\n");
    }
    public double getBalance() {
        return this.balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            totalTransactionCount += 1;
            System.err.printf("Deposit successful.\n");
        } else {
            System.out.printf("Invalid amount\n");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {
                this.balance -= amount;
                totalTransactionCount += 1;
                System.err.printf("Withdrawal successful.\n");
            } else {
                System.err.printf("Insufficient funds.\n");
            }
        } else {
            System.out.printf("Invalid amount\n");
        }
    }
    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}
