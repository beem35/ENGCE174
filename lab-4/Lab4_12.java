import java.util.Scanner;

public class Lab4_12 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Name : ");
        String name = myScanner.nextLine();
        System.out.printf("Hour : ");
        int hour = myScanner.nextInt();
        System.out.printf("New Hour : ");
        int newHour = myScanner.nextInt();
        Schedule sch1 = new Schedule(hour);
        EmployeeSchedule emp1 = new EmployeeSchedule(name, sch1);
        EmployeeSchedule emp2 = new EmployeeSchedule(emp1);
        sch1.setHour(newHour);
        emp1.displaySchedule();
        emp2.displaySchedule();
        myScanner.close();
    }
}

class Schedule {
    private int hour;

    public Schedule(int hour) {
        this.hour = (hour > 0 && hour < 23) ? hour : (hour < 0) ? 0 : 23;
    }

    public void setHour(int newHour) {
        if (newHour < 0 || newHour > 23) {
            throw new IllegalArgumentException("Hour must be between 0 and 23\n");
        }
        this.hour = newHour;
    }

    public int getHour() {
        return hour;
    }

    public Schedule(Schedule other) {
        this.hour = other.hour;
    }
}

class EmployeeSchedule {

    private String name;
    private Schedule schedule;

    public EmployeeSchedule(String name, Schedule schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    public EmployeeSchedule(EmployeeSchedule other) {
        this.name = other.name;
        this.schedule = new Schedule(other.schedule);
    }

    public void displaySchedule() {
        System.out.printf("%s : %d:00 \n",this.name,this.schedule.getHour());
    }
}