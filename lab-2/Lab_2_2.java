import java.util.Scanner;

public class Lab_2_2 {
    static class Student {
        String studentID;
        String name;
        public void displayInfo() {
            System.out.println("Student information");
            System.out.println(this.studentID);
            System.out.println(this.name);
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Input Student ID : ");
        String id = myScanner.nextLine();
        System.out.printf("Input Student Name : ");
        String name = myScanner.nextLine();
        Student s1 = new Student();
        s1.studentID = id;
        s1.name = name;
        s1.displayInfo();
        myScanner.close();
    }
}
