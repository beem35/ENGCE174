package lab5_1;

import java.util.Scanner;

public class Lab5_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = myScanner.nextLine();
        System.out.print("Age: ");
        int age = myScanner.nextInt();
        Dog dog = new Dog();
        dog.name = name;
        dog.age = age;
        dog.makeSound();
        dog.displayInfo();
        myScanner.close();
    }
}

class Animal {

    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

}

class Dog extends Animal {

    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}