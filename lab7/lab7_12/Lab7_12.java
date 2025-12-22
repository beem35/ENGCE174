package lab7.lab7_12;

import java.util.Scanner;

public class Lab7_12 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Type1: ");
        String type1 = myScanner.nextLine();
        System.out.print("Type2: ");
        String type2 = myScanner.nextLine();
        ReportGenerator g1 = (type1.equalsIgnoreCase("PDF") ? new PDFGenerator()
                : (type1.equalsIgnoreCase("CSV") ? new CSVGenerator() : null));
        ReportGenerator g2 = (type2.equalsIgnoreCase("PDF") ? new PDFGenerator()
                : (type2.equalsIgnoreCase("CSV") ? new CSVGenerator() : null));
        IReport report1 = g1.createReport();
        IReport report2 = g2.createReport();
        report1.printDocument();
        report2.printDocument();
        myScanner.close();
    }
}

interface IReport {
    public void printDocument();
}

class PDFReport implements IReport {
    @Override
    public void printDocument() {
        System.out.printf("Generating PDF Report.\n");
    }
}

class CSVReport implements IReport {
    @Override
    public void printDocument() {
        System.out.printf("Generating CSV Report.\n");
    }
}

abstract class ReportGenerator {
    public abstract IReport createReport();
}

class PDFGenerator extends ReportGenerator {
    @Override
    public IReport createReport() {
        return new PDFReport();
    }
}

class CSVGenerator extends ReportGenerator {
    @Override
    public IReport createReport() {
        return new CSVReport();
    }
}