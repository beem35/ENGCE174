package lab5.lab5_7;

import java.util.Scanner;

public class Lab5_7 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Name Employee: ");
        String nameEmp = myScanner.nextLine();
        System.out.print("Salary: ");
        double salary1 = myScanner.nextDouble();
        System.out.print("Rate: ");
        double rate = myScanner.nextDouble();
        myScanner.nextLine();
        System.out.print("Name Manager: ");
        String nameMan = myScanner.nextLine();
        System.out.print("Salary: ");
        double salary2 = myScanner.nextDouble();
        System.out.print("Bonus: ");
        double bonus = myScanner.nextDouble();
        SalesEmployee sales = new SalesEmployee(nameEmp, salary1, rate);
        Manager manager = new Manager(nameMan, salary2, bonus);
        PayrollProcessor.process(sales);
        PayrollProcessor.process(manager);
        myScanner.close();
    }
}

class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }
}

class SalesEmployee extends Employee {
    protected double commissionRate;

    public SalesEmployee(String name, double baseSalary, double commissionRate) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return this.baseSalary + (this.baseSalary * this.commissionRate);
    }
}

class Manager extends Employee {
    protected double fixedBonus;

    public Manager(String name, double baseSalary, double fixedBonus) {
        super(name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    @Override
    public double calculatePay() {
        return this.baseSalary + this.fixedBonus;
    }
}

class PayrollProcessor {

    public static void process(Employee e) {
        System.out.printf("%s total pay: %.2f\n",e.name,e.calculatePay());
    }
}