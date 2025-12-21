package lab7.lab7_4;

import java.util.Scanner;

public class Lab7_4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Model1: ");
        String model1 = myScanner.nextLine();
        System.out.print("Print: ");
        String doc1 = myScanner.nextLine();
        System.out.print("Model2: ");
        String model2 = myScanner.nextLine();
        System.out.print("Print: ");
        String doc2 = myScanner.nextLine();
        System.out.print("Scan: ");
        String doc3 = myScanner.nextLine();
        SimplePrinter simplePrinter = new SimplePrinter(model1);
        MultiFunctionDevice mDevice = new MultiFunctionDevice(model2);
        simplePrinter.printDocument(doc1);
        mDevice.printDocument(doc2);
        mDevice.scanDoucment(doc3);
        myScanner.close();
    }
}

interface IPrintTool {
    public void printDocument(String documentName);
}

interface IScanTool {
    public void scanDoucment(String documentName);
}

class SimplePrinter implements IPrintTool {
    protected String model;

    public SimplePrinter(String model) {
        this.model = model;
    }

    @Override
    public void printDocument(String documentName) {
        System.out.printf("Printer %s: Printing %s \n", this.model, documentName);
    }
}

class MultiFunctionDevice implements IPrintTool, IScanTool {
    protected String model;

    public MultiFunctionDevice(String model) {
        this.model = model;
    }

    @Override
    public void printDocument(String documentName) {
        System.out.printf("Printer %s: Printing %s \n", this.model, documentName);
    }

    @Override
    public void scanDoucment(String documentName) {
        System.out.printf("MFD %s: Scanning %s \n", this.model, documentName);
    }
}