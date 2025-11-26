import java.util.Scanner;

public class Lab_2_12 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("ID Course : ");
        String id = myScanner.nextLine();
        System.out.print("Name Course : ");
        String nameCou = myScanner.nextLine();
        System.out.print("Name Student : ");
        String nameStu = myScanner.nextLine();

        Course cou = new Course(id, nameCou);
        Student6 stu = new Student6(nameStu, cou);
        System.out.print("---------------\n");
        stu.displayEnrollment();
        myScanner.close();
    }
}

class Course {
    private String courseld;
    private String courseName;

    public Course(String courseld, String courseName) {
        this.courseName = courseName;
        this.courseld = courseld;
    }

    public String getCourseinfo() {
        String course = this.courseld + ": " + this.courseName;
        return course;
    }
}

class Student6 {
    private String studentName;
    private Course enrolledCourse;

    public Student6(String stu, Course enroll) {
        this.enrolledCourse = enroll;
        this.studentName = stu;
    }

    public void displayEnrollment() {
        System.out.printf("Student : %s\n", this.studentName);
        System.out.printf("Enrolled in : %s \n", this.enrolledCourse.getCourseinfo());
    }
}
