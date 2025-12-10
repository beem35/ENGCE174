package lab5_5;

import java.util.Scanner;

public class Lab5_5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Radius : ");
        double radius = myScanner.nextDouble();
        System.out.print("Width : ");
        double width = myScanner.nextDouble();
        System.out.print("Height : ");
        double height = myScanner.nextDouble();
        Circle circle = new Circle("Circle", radius);
        Rectangle rectangle = new Rectangle("Rectangle", width, height);
        Shape[] shapes = new Shape[2];
        shapes[0] = circle;
        shapes[1] = rectangle;
        for (int i = 0; i < 2; i++) {
            System.out.printf("[%d] %s : %.2f \n", i + 1, shapes[i].name, shapes[i].calcuateArea());
        }
        myScanner.close();
    }
}

class Shape {
    protected String name;

    public double calcuateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public double calcuateArea() {
        return 3.14159 * (this.radius * this.radius);
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcuateArea() {
        return this.height * this.width;
    }
}