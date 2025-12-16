package lab6_1;

import java.util.Scanner;

public class Lab6_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.printf("Name : ");
        String name = myScanner.nextLine();

        System.out.printf("MonthlySalary : ");
        double salary = myScanner.nextDouble();

        SalaryEmployee sEmployee = new SalaryEmployee(name, salary);
        sEmployee.displayInfo();
        System.out.printf("MonthlySalary : %.2f \n", sEmployee.calculatePay());
        myScanner.close();
    }
}

abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.printf("Employee Name: %s \n", this.name);
    }

    public abstract double calculatePay();
}

class SalaryEmployee extends Employee {
    protected double monthlySalary;

    public SalaryEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}