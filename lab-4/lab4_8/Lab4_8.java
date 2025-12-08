package lab4_8;
import java.util.Scanner;

public class Lab4_8 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Mode : ");
        int mode = myScanner.nextInt();
        myScanner.nextLine();
        if (mode == 1) {
            System.out.printf("Title : ");
            String title = myScanner.nextLine();
            Movie mov = new Movie(title);
            mov.displayDetails();
        } else if (mode == 2) {
            System.out.printf("Title : ");
            String title = myScanner.nextLine();
            System.out.printf("Director : ");
            String director = myScanner.nextLine();
            Movie mov = new Movie(title, director);
            mov.displayDetails();
        } else if (mode == 3) {
            System.out.printf("Title : ");
            String title = myScanner.nextLine();
            System.out.printf("Director : ");
            String director = myScanner.nextLine();
            System.out.printf("Rating : ");
            double rating = myScanner.nextDouble();
            Movie mov = new Movie(title, director, rating);
            mov.displayDetails();
        } else {
            System.out.printf("Error mode");
        }
        myScanner.close();
    }
}

class Movie {

    private String title;
    private String director;
    private double rating;

    public Movie(String title) {
        this(title, "Unknown");
    }

    public Movie(String title, String director) {
        this(title, director, 0.0);
    }

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = (rating > 0 && rating < 10) ? rating : (rating > 10) ? 10.0 : 0.0;
    }

    public void displayDetails() {
        System.out.printf("Title: %s, Director: %s, Rating: %.1f\n", this.title, this.director, this.rating);
    }
}