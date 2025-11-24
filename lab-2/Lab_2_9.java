import java.util.Scanner;

public class Lab_2_9 {
    static class Address {
        private String street;
        private String city;
        private String zipCode;

        public Address(String street, String city, String zipCode) {
            this.street = street;
            this.city = city;
            this.zipCode = zipCode;
        }

        public String getFullAddress() {
            String add = this.street + ", " + this.city + ", " + this.zipCode;
            return add;
        }
    }

    static class Student {
        private String name;
        private Address address;

        public Student(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        public void displayProfile() {
            System.out.printf("Name : %s\n", this.name);
            System.out.println("Address : " + this.address.getFullAddress());
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Name : ");
        String name = myScanner.nextLine();
        System.out.printf("Street : ");
        String street = myScanner.nextLine();
        System.out.printf("City : ");
        String city = myScanner.nextLine();
        System.out.printf("ZipCode : ");
        String zip = myScanner.nextLine();

        Address add = new Address(street, city, zip);
        Student stu = new Student(name, add);
        stu.displayProfile();
        myScanner.close();
    }
}
