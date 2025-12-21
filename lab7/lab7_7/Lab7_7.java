package lab7.lab7_7;

import java.util.Scanner;

public class Lab7_7 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Type: ");
        String type1 = myScanner.nextLine();
        System.out.print("Type: ");
        String type2 = myScanner.nextLine();
        IVehicle vehicle1 = VehicleFactory.createVehicle(type1);
        IVehicle vehicle2 = VehicleFactory.createVehicle(type2);
        if (vehicle1 != null) {
            vehicle1.start();
        }
        if (vehicle2 != null) {
            vehicle2.start();
        }
        myScanner.close();
    }
}

interface IVehicle {
    void start();
}

class Car implements IVehicle {
    @Override
    public void start() {
        System.out.printf("Car engine started.\n");
    }
}

class Motorcycle implements IVehicle {
    @Override
    public void start() {
        System.out.printf("Motorcycle engine started.\n");
    }
}

class VehicleFactory {
    public static IVehicle createVehicle(String type) {

        if (type.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (type.equalsIgnoreCase("BIKE")) {
            return new Motorcycle();
        }
        return null;
    }
}