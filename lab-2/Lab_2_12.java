import java.util.Scanner;

public class Lab_2_12 {
    static class Course {
        private String courseld;
        private String courseName;
        
        public Course(String courseld , String courseName){
            this.courseName = courseName;
            this.courseld = courseld;
        }

        public String getCourseinfo(){
            String course = this.courseld+": "+this.courseName;
            return course;
        }
    }

    static class Student {
        private String studentName;
        private Course enrolledCourse;
        
        public Student(String stu , Course enroll){
            this.enrolledCourse = enroll;
            this.studentName = stu;
        }

        public void displayEnrollment(){
            System.out.printf("Student : %s\n",this.studentName);
            System.out.printf("Enrolled in : %s \n",this.enrolledCourse.getCourseinfo());
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("ID Course : ");
        String id = myScanner.nextLine();
        System.out.print("Name Course : ");
        String nameCou = myScanner.nextLine();
        System.out.print("Name Student : ");
        String nameStu = myScanner.nextLine();

        Course cou = new Course(id, nameCou);
        Student stu = new Student(nameStu, cou);
        System.out.print("---------------\n");
        stu.displayEnrollment();
        myScanner.close();
    }   
}
