package lab5_2;

import java.util.Scanner;

public class Lab5_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = myScanner.nextLine();
        System.out.print("Age: ");
        int age = myScanner.nextInt();
        Cat cat = new Cat();
        cat.name = name;
        cat.age = age;
        cat.makeSound();
        cat.displayInfo();
        myScanner.close();
    }
}

class Animal {

    protected String name;
    protected int age;

    public void makeSound() {
        System.out.println("I am an animal.");
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}