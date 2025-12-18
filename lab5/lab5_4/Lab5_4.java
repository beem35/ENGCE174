package lab5.lab5_4;

import java.util.Scanner;

public class Lab5_4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Color: ");
        String color = myScanner.nextLine();
        System.out.print("Wheels: ");
        int wheels = myScanner.nextInt();
        Car car = new Car(color, wheels);
        car.displayDetails();
        myScanner.close();
    }
}

class Vehicle {

    protected String color;

    public Vehicle(String color) {
        this.color = color;
    }
}

class Car extends Vehicle {
    protected int wheels;

    public Car(String color, int wheels) {
        super(color);
        this.wheels = wheels;
    }

    public void displayDetails(){
        System.out.println("Color: "+this.color+", Wheels: "+this.wheels);
    }
}