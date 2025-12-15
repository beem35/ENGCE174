package lab6_2;

import java.util.Scanner;

public class Lab6_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.printf("Name : ");
        String name = myScanner.nextLine();

        System.out.printf("ID : ");
        String id = myScanner.nextLine();

        Student stu = new Student(name, id);
        stu.display();
        System.out.println(stu.getDetail());
        myScanner.close();
    }
}

interface IDisplayable {
    public void display();

    public String getDetail();
}

class Student implements IDisplayable {
    protected String naem;
    protected String studentId;

    public Student(String name, String studentId) {
        this.naem = name;
        this.studentId = studentId;
    }

    @Override
    public void display() {
        System.out.println("--- Student Profile ---");
    }

    @Override
    public String getDetail() {
        return "Name: " + this.naem + ", ID: " + this.studentId;
    }
}