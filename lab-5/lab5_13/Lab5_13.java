package lab5_13;

import java.util.Scanner;

public class Lab5_13 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Dev Name: ");
        String devName = myScanner.nextLine();
        System.out.printf("Projects: ");
        int projects1 = myScanner.nextInt();
        myScanner.nextLine();
        System.out.printf("Admin Name: ");
        String admName = myScanner.nextLine();
        System.out.printf("Projects: ");
        int projects2 = myScanner.nextInt();
        myScanner.nextLine();
        System.out.printf("Admin Key: ");
        String key = myScanner.nextLine();
        User u1 = new User("Guest");
        Developer d1 = new Developer(devName, projects1);
        Admin a1 = new Admin(admName, projects2, key);
        User[] arrayUser = new User[3];
        arrayUser[0] = u1;
        arrayUser[1] = d1;
        arrayUser[2] = a1;
        int TotalClearance = 0;
        for (int i = 0; i < arrayUser.length; i++) {
            TotalClearance += arrayUser[i].getClearanceLevel();
            if (arrayUser[i] instanceof Admin) {
                Admin a2 = (Admin) arrayUser[i];
                System.out.printf("Key : %s\n", a2.getAdminKey());
            }
        }
        System.out.printf("TotalClearance : %d \n", TotalClearance);
        myScanner.close();
    }
}

class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public int getClearanceLevel() {
        return 1;
    }
}

class Developer extends User {
    protected int projects;

    public Developer(String name, int projects) {
        super(name);
        this.projects = projects;
    }

    @Override
    public int getClearanceLevel() {
        return 2;
    }
}

class Admin extends Developer {
    protected String adminKey;

    public Admin(String name, int projects, String adminKey) {
        super(name, projects);
        this.adminKey = adminKey;
    }

    @Override
    public int getClearanceLevel() {
        return 3;
    }

    public String getAdminKey() {
        return adminKey;
    }
}