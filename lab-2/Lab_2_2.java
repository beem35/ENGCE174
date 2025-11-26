import java.util.Scanner;

public class Lab_2_2 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Input Student ID : ");
        String id = myScanner.nextLine();
        System.out.printf("Input Student Name : ");
        String name = myScanner.nextLine();
        Student2 s1 = new Student2();
        s1.studentID = id;
        s1.name = name;
        s1.displayInfo();
        myScanner.close();
    }
}

class Student2 {
    String studentID;
    String name;

    public void displayInfo() {
        System.out.println("Student information");
        System.out.println(this.studentID);
        System.out.println(this.name);
    }
}