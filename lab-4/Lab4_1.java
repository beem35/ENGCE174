import java.util.Scanner;

public class Lab4_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Mode : ");
        int mode = myScanner.nextInt();
        myScanner.nextLine();
        if (mode == 1) {
            System.out.printf("Title : ");
            String title = myScanner.nextLine();
            Bookv2 book = new Bookv2(title);
            book.displayInfo();
        } else if (mode == 2) {
            System.out.printf("Title : ");
            String title = myScanner.nextLine();
            System.out.printf("Author : ");
            String author = myScanner.nextLine();
            Bookv2 book = new Bookv2(title, author);
            book.displayInfo();
        } else {
            System.out.printf("Error mode");
        }
        myScanner.close();
    }
}

class Bookv2 {
    
    private String title;
    private String author;

    
    public Bookv2(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    
    public Bookv2(String title, String author) {
        this.title = title;
        this.author = author;
    }

    
    public void displayInfo() {
        System.out.printf("Title: %s, Author: %s\n",this.title ,this.author);
    }
}