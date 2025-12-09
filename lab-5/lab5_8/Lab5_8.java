package lab5_8;

import java.util.Scanner;

public class Lab5_8 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Student Name: ");
        String name1 = myScanner.nextLine();
        System.out.print("Student ID: ");
        int stuID = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("Employee Name: ");
        String name2 = myScanner.nextLine();
        System.out.print("Employee Salary: ");
        double salary = myScanner.nextDouble();
        Student student = new Student(name1, stuID);
        Employee employee = new Employee(name2, salary);
        Person[] persons = new Person[2];
        persons[0] = student;
        persons[1] = employee;
        for (int i = 0; i < 2; i++) {
            if (persons[i] instanceof Employee) {
                employee.applyBonus(1000.0);
            }
            System.out.println(persons[i].getStatus());
        }
        myScanner.close();
    }
}

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getStatus() {
        return "Person: " + this.name;
    }
}

class Student extends Person {
    protected int studentID;

    public Student(String name, int studentID) {
        super(name);
        this.studentID = studentID;
    }

    @Override
    public String getStatus() {
        return "Student: " + this.name + ", ID: " + this.studentID;
    }
}

class Employee extends Person {
    protected double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void applyBonus(double bonus) {
        this.salary += bonus;
    }

    @Override
    public String getStatus() {
        return "Employee: " + this.name + ", Salary: " + this.salary;
    }
}