import java.util.Scanner;

public class Lab_2_3 {
    static class Student {
        private String studentID;
        private String name;
        public static int studentCount = 0;

        public Student(String studentID, String name) {
            this.studentID = studentID;
            this.name = name;
            studentCount++;
        }

    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Input loop of Students : ");
        int n = myScanner.nextInt();
        Student[] ss = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Input Student ID : ");
            String id = myScanner.nextLine();
            System.out.printf("Input Student Name : ");
            String name = myScanner.nextLine();
            ss[i] = new Student(id, name);
        }
        System.out.println("Total students: " + Student.studentCount);
        myScanner.close();
    }
}
