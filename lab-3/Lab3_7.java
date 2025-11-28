import java.util.Scanner;

public class Lab3_7 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("ID Employee : ");
        String id = myScanner.nextLine();
        System.out.printf("Department : ");
        String depart = myScanner.nextLine();
        System.out.printf("New Department : ");
        String newdepart = myScanner.nextLine();
        Employee emp = new Employee(id, depart);
        emp.setDepartment(newdepart);
        System.out.printf("Employee ID : %s\nDepartment : %s", emp.getEmployeeid(), emp.getDepartment());
        myScanner.close();

    }
}

class Employee {
    private String employeeid;
    private String department;

    public Employee(String employeeid, String department) {
        this.employeeid = employeeid;
        this.department = department;
    }

    public String getEmployeeid() {
        return this.employeeid;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }
}