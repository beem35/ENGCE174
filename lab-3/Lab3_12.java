import java.util.Scanner;

public class Lab3_12 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Name : ");
        String name = myScanner.nextLine();
        System.out.printf("Salary : ");
        double salary = myScanner.nextDouble();
        System.out.printf("TaxRate : ");
        double tax = myScanner.nextDouble();
        System.out.printf("RaiseAmount : ");
        double Raise = myScanner.nextDouble();
        EmployeeV3 emp = new EmployeeV3(name, salary);
        System.out.printf("Tax(Before) : %.2f\n", emp.calculateTax(tax));
        emp.giveRaise(Raise);
        System.out.printf("Tax(After) : %.2f\n", emp.calculateTax(tax));
        myScanner.close();
    }
}
class EmployeeV3 {
    private String name;
    private double monthlySalary;
    public EmployeeV3(String name, double monthlySalary) {
        this.name = name;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }
    public String getName() {
        return this.name;
    }
    public void giveRaise(double amount) {
        if (amount > 0) {
            this.monthlySalary += amount;
            System.out.printf("Raise applied.\n");
        } else {
            System.out.printf("Invalid amount.\n");
        }
    }
    private double getAnnualSalary() {
        return this.monthlySalary * 12;
    }
    public double calculateTax(double taxRate) {
        return getAnnualSalary() * taxRate;
    }
}