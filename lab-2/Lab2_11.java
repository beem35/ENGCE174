import java.util.Scanner;

public class Lab2_11 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Name Model Car : ");
        String name = myScanner.nextLine();
        System.out.printf("Year :");
        int num = myScanner.nextInt();
        System.out.printf("New Year :");
        int newNum = myScanner.nextInt();
        Car myCar = new Car(name, num);
        myCar.setYear(newNum);
        System.out.printf("---------------------\n");
        System.out.printf("Model : %s\n", myCar.getModel());
        System.out.printf("Year : %d \n", myCar.getYear());
        myScanner.close();
    }
}

class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }
}
