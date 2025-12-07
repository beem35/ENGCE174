import java.util.Scanner;

public class Lab4_13 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Max : ");
        int maxDuration = myScanner.nextInt();
        Subscription.setMaxDuration(maxDuration);
        myScanner.nextLine();
        System.out.printf("Name : ");
        String name = myScanner.nextLine();
        System.out.printf("Input Day [1] : ");
        int day1 = myScanner.nextInt();
        System.out.printf("Input Day [2] : ");
        int day2 = myScanner.nextInt();
        System.out.printf("Input Day [3] : ");
        int day3 = myScanner.nextInt();
        Subscription sub1 = new Subscription(name, day1);
        Subscription sub2 = sub1.extend(day2);
        Subscription sub3 = sub2.extend(day3);
        sub3.displayInfo();
        myScanner.close();
    }
}

class Subscription {

    private final String planName;
    private final int durationDays;

    private static int maxDuration = 365;

    public Subscription(String planName, int durationDays) {
        durationDays = (durationDays > maxDuration)? maxDuration : (durationDays < 0)? 0 : durationDays;
        this.planName = planName;
        this.durationDays = durationDays;
    }

    public Subscription(Subscription other) {
        this.durationDays = other.durationDays;
        this.planName = other.planName;
    }

    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
            System.out.printf("Max duration set to %d\n",maxDuration);
        } else {
            System.out.printf("Invalid max policy.\n");
        }
    }

    public Subscription extend(int days) {
        if (days <= 0) {
            System.out.printf("Invalid extension days.\n");
            return this;
        } else {
            System.out.printf("Extension successful.\n");
        }
        int newDay =this.durationDays + days;
        if (newDay > maxDuration) {
            System.out.printf("Extension failed: Exceeds max policy.\n");
            return this;
        }
        return new Subscription(planName, newDay);
    }

    public void displayInfo() {
        System.out.printf("Plan: %s, Days: %d\n",this.planName,this.durationDays);
    }
}