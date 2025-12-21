package lab7.lab7_6;

import java.util.Scanner;

public class Lab7_6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Width: ");
        double width = myScanner.nextDouble();
        System.out.print("Length: ");
        double length = myScanner.nextDouble();
        System.out.print("Height: ");
        double height = myScanner.nextDouble();
        Room room = new Room(width, length, height);
        System.out.printf("PaintCost: %.2f \n", room.calculatePaintCost());
        myScanner.close();
    }
}

class Room {
    private double width;
    private double length;
    private double height;
    private static final double PAINT_RATE = 5.0;

    public Room(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    private double calculateWallArea() {
        return (2 * (this.width + this.length) * this.height);
    }

    public double calculatePaintCost() {

        return calculateWallArea() * PAINT_RATE;
    }
}