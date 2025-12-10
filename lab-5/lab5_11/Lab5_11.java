package lab5_11;

import java.util.Scanner;

public class Lab5_11 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Title : ");
        String title1 = myScanner.nextLine();
        System.out.print("Word Count : ");
        int word1 = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("Title : ");
        String title3 = myScanner.nextLine();
        System.out.print("Page Count : ");
        int page1 = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("Title : ");
        String title2 = myScanner.nextLine();
        System.out.print("Word Count : ");
        int word2 = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("Title : ");
        String title4 = myScanner.nextLine();
        System.out.print("Page Count : ");
        int page2 = myScanner.nextInt();
        TextDocument text1 = new TextDocument(title1, word1);
        PDFDocument pdf1 = new PDFDocument(title3, page1);
        TextDocument text2 = new TextDocument(title2, word2);
        PDFDocument pdf2 = new PDFDocument(title4, page2);
        Document[] doc = new Document[4];
        doc[0] = text1;
        doc[1] = pdf1;
        doc[2] = text2;
        doc[3] = pdf2;
        int TotalPages = 0;
        for (int i = 0; i < doc.length; i++) {
            if (doc[i] instanceof PDFDocument) {
                PDFDocument Pdoc = (PDFDocument) doc[i];
                TotalPages += Pdoc.pageCount;
            }
            doc[i].displayDetails();
        }
        System.out.printf("Total Pages: %d\n", TotalPages);
        myScanner.close();
    }
}

class Document {

    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.printf("Document: %s \n", this.title);
    }
}

class TextDocument extends Document {

    protected int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails() {
        System.out.printf("Text: %s, Words: %d \n", this.title, this.wordCount);
    }
}

class PDFDocument extends Document {

    protected int pageCount;

    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.printf("PDF: %s, Pages: %d \n", this.title, this.pageCount);
    }
}