package lab6_8;

import java.util.Scanner;

public class Lab6_8 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Name : ");
        String name1 = myScanner.nextLine();
        System.out.print("Power : ");
        double power1 = myScanner.nextDouble();
        System.out.print("Hours : ");
        int hours1 = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("Name : ");
        String name2 = myScanner.nextLine();
        System.out.print("Power : ");
        double power2 = myScanner.nextDouble();
        System.out.print("Hours : ");
        int hours2 = myScanner.nextInt();
        SolarPanel p1 = new SolarPanel(name1, power1, hours1);
        SolarPanel p2 = new SolarPanel(name2, power2, hours2);
        p1.increaseUsage(100);
        PowerGenerator[] PG = new PowerGenerator[2];
        PG[0] = p1;
        PG[1] = p2;
        for (int i = 0; i < PG.length; i++) {
            System.out.printf("OutPut[%d]: %.2f\n", i + 1, PG[i].calculateOutput());
        }
        myScanner.close();
    }
}

interface IMaintainable {
    public boolean needsMaintenance();
}

abstract class PowerGenerator implements IMaintainable {
    protected String name;
    protected double basePower;
    protected int usageHours;

    public PowerGenerator(String name, double basePower, int usageHours) {
        this.name = name;
        this.basePower = basePower;
        this.usageHours = usageHours;
    }

    public void increaseUsage(int hours) {
        this.usageHours += hours;
    }

    public abstract double getEfficiency();

    public double calculateOutput() {
        return this.basePower * getEfficiency();
    }
}

class SolarPanel extends PowerGenerator {
    public SolarPanel(String name, double basePower, int usageHours) {
        super(name, basePower, usageHours);
    }

    @Override
    public double getEfficiency() {
        return 0.9;
    }

    @Override
    public boolean needsMaintenance() {
        return (this.usageHours > 100) ? true : false;
    }

    public double calculateFinalOutput() {
        double base = super.calculateOutput();
        if (needsMaintenance()) {
            return base * 0.5;
        }
        return base;
    }
}