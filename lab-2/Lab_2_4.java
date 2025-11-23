import java.util.Scanner;

public class Lab_2_4 {
    static class Student {
        private int midtermScore;
        private int finalScore;
        private String name;

        public Student(String name, int mid, int fin) {
            this.midtermScore = mid;
            this.finalScore = fin;
            this.name = name;
        }

        public double calculateAverge() {
            double sum = (this.midtermScore + this.finalScore) / 2.0;
            return sum;
        }

        public void displaySummary() {
            double avg = calculateAverge();
            System.out.printf("Name : %s\n", name);
            System.out.printf("Average Score : %.2f\n",avg);
            System.out.printf("Statu : %s\n", (50 <= avg) ? "Pass" : "Fail");

        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Input Student Name : ");
        String name = myScanner.nextLine();
        System.out.printf("Input Midterm Score : ");
        int mid = myScanner.nextInt();
        System.out.printf("Input Final Score : ");
        int fin = myScanner.nextInt();
        Student s1 = new Student(name, mid, fin);
        s1.displaySummary();
        myScanner.close();
    }
}
