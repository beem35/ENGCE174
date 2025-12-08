package lab5_3;

import java.util.Scanner;

public class Lab5_3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("My Salary: ");
        double salary = myScanner.nextDouble();
        Manager mg = new Manager();
        mg.salary = salary;
        System.out.println("Bonus: " + mg.calculateBonus());
        myScanner.close();
    }
}

class Employee {
    protected double salary;

    public double calculateBonus() {

        return this.salary * 0.1;
    }
}

class Manager extends Employee {

    @Override
    public double calculateBonus() {

        return this.salary * 0.15;
    }
}