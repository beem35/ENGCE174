import java.util.Scanner;

public class Lab_2_3 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Input loop of Students : ");
        int n = myScanner.nextInt();
        String id;
        String name;
        Student3[] ss = new Student3[n];
        for (int i = 0; i < n; i++) {
            myScanner.nextLine();
            System.out.printf("Input Student ID : ");
            id = myScanner.nextLine();

            System.out.printf("Input Student Name : ");
            name = myScanner.nextLine();
            ss[i] = new Student3(id, name);
        }
        System.out.println("Total students: " + Student3.studentCount);
        myScanner.close();
    }
}

class Student3 {
    private String studentID;
    private String name;
    public static int studentCount = 0;

    public Student3(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        studentCount++;
    }

}