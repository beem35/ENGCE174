package lab6_7;

import java.util.Scanner;

public class Lab6_7 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Speed : ");
        int speed = myScanner.nextInt();
        System.out.printf("Weight : ");
        int weight = myScanner.nextInt();
        Truck truck = new Truck(speed, weight);
        truck.displaySpeed();
        truck.startEngine();
        myScanner.close();
    }
}

interface IDrivable {
    public void startEngine();
}

abstract class Vehicle implements IDrivable {
    protected int currentSpeed;

    public Vehicle(int speed) {
        this.currentSpeed = speed;
    }

    public void displaySpeed() {
        System.out.printf("Current Speed: %d km/h\n", this.currentSpeed);
    }

    public abstract void startEngine();
}

class Truck extends Vehicle {
    protected int cargoWeight;

    public Truck(int speed, int weight) {
        super(speed);
        this.cargoWeight = weight;
    }

    @Override
    public void startEngine() {
        System.out.printf("Truck engine started. Max cargo: %d tons.\n", this.cargoWeight);
    }
}