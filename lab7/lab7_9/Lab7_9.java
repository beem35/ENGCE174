package lab7.lab7_9;

import java.util.Scanner;

public class Lab7_9 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("CPU : ");
        String cpu = myScanner.nextLine();
        System.out.print("RAM : ");
        int ram = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("GPU : ");
        String gpu = myScanner.nextLine();
        Computer computer = new Computer.ComputerBuilder().setCPU(cpu).setRAM(ram).setGPU(gpu).build();
        computer.displaySpecs();
        myScanner.close();
    }
}

class Computer {
    private String cpu;
    private int ram;
    private String gpu;

    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.gpu = builder.gpu;
    }

    public void displaySpecs() {
        System.out.println("Specs: CPU= " + cpu + ", RAM= " + ram + "GB, GPU= " + gpu);
    }

    public static class ComputerBuilder {

        private String cpu;
        private int ram;
        private String gpu;

        public ComputerBuilder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setRAM(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setGPU(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}