package lab5.lab5_15;

import java.util.Scanner;

public class Lab5_15 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Car model : ");
        String model1 = myScanner.nextLine();
        System.out.printf("Rental Rate : ");
        double rate1 = myScanner.nextDouble();
        myScanner.nextLine();
        System.out.printf("Motorcycle model : ");
        String model2 = myScanner.nextLine();
        System.out.printf("Rental Rate : ");
        double rate2 = myScanner.nextDouble();
        Car car = new Car(model1, rate1);
        Motorcycle motorcycle = new Motorcycle(model2, rate2);
        RentalVehicle[] rVehicles = new RentalVehicle[2];
        rVehicles[0] = car;
        rVehicles[1] = motorcycle;
        double TotalFee = 0;
        for (int i = 0; i < rVehicles.length; i++) {
            TotalFee += rVehicles[i].calculateFee();
            System.out.printf("%s add\n", rVehicles[i].model);
        }
        System.out.printf("Total Rental Fee : %.2f\n", TotalFee);
        myScanner.close();
    }
}

class RentalVehicle {
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class Car extends RentalVehicle {
    public Car(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {

        return this.rentalRate + 100;
    }
}

class Motorcycle extends RentalVehicle {
    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return this.rentalRate * 1.10;
    }
}
