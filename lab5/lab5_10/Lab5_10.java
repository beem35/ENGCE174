package lab5.lab5_10;

import java.util.Scanner;

public class Lab5_10 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Description : ");
        String desc1 = myScanner.nextLine();
        System.out.print("Hours : ");
        int hours1 = myScanner.nextInt();
        System.out.print("Fee : ");
        double fee = myScanner.nextDouble();
        myScanner.nextLine();
        System.out.print("Description : ");
        String desc2 = myScanner.nextLine();
        System.out.print("Hours : ");
        int hours2 = myScanner.nextInt();
        ComplexTask complexTask = new ComplexTask(desc1, hours1, fee);
        SimpleTask simpleTask = new SimpleTask(desc2, hours2);
        ProjectTask[] projectTasks = new ProjectTask[2];
        projectTasks[0] = complexTask;
        projectTasks[1] = simpleTask;
        for (int i = 0; i < 2; i++) {
            System.out.printf("%s Cost : %.2f\n", projectTasks[i].description, projectTasks[i].calcuateCost());
        }
        myScanner.close();
    }
}

class ProjectTask {
    protected String description;
    protected int baseHours;

    public ProjectTask(String desc, int hours) {
        this.description = desc;
        this.baseHours = hours;
    }

    public double calcuateCost() {
        return baseHours * 50.0;
    }
}

class ComplexTask extends ProjectTask {

    protected double setupFee;

    public ComplexTask(String desc, int hours, double fee) {
        super(desc, hours);
        this.setupFee = fee;
    }

    @Override
    public double calcuateCost() {
        return (super.calcuateCost() * 1.10) + setupFee;
    }
}

class SimpleTask extends ProjectTask {
    public SimpleTask(String desc, int hours) {
        super(desc, hours);
    }

    @Override
    public double calcuateCost() {
        return super.calcuateCost() * 1.10;
    }
}