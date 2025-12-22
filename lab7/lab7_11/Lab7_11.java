package lab7.lab7_11;

import java.util.Scanner;

public class Lab7_11 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Title: ");
        String title = myScanner.nextLine();
        System.out.print("Content: ");
        String content = myScanner.nextLine();
        Document document = new Document(title, content);
        Printer printer = new Printer();
        printer.print(document);
        myScanner.close();
    }
}

class Document {
    protected String title;
    protected String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getPrintableContent() {

        return "*** " + this.title + " ***\n" + this.content;
    }
}

class Printer {
    public void print(Document doc) {
        String printableContent = doc.getPrintableContent();
        System.out.printf("---START PRINT ---\n%s \n---END PRINT---\n", printableContent);
    }
}