package lab7.lab7_1;

import java.util.Scanner;

public class Lab7_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Name: ");
        String name = myScanner.nextLine();
        System.out.printf("Rate: ");
        double rate = myScanner.nextDouble();
        System.out.printf("Hours: ");
        int hours = myScanner.nextInt();
        EmployeeData emp = new EmployeeData(name, rate, hours);
        double pay = PayrollProcessor.calculateGrossPay(emp);
        System.out.printf("Employee: %s, Gross Pay: %.2f \n", emp.getName(), pay);
        myScanner.close();
    }
}

class EmployeeData {
    protected String name;
    protected double hourlyRate;
    protected int hoursWorked;

    public EmployeeData(String name, double rate, int hours) {
        this.name = name;
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    public String getName() {
        return this.name;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public int getHoursWorked() {
        return this.hoursWorked;
    }
}

class PayrollProcessor {
    public static double calculateGrossPay(EmployeeData employee) {

        return employee.getHourlyRate() * employee.getHoursWorked();
    }
}