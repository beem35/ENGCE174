import java.util.Scanner;

public class Lab4_10 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Mode : ");
        int mode = myScanner.nextInt();
        if (mode == 1) {
            TimePeriod time = new TimePeriod();
            time.displayPeriod();
        } else if (mode == 2) {
            System.out.printf("Start : ");
            int sHour = myScanner.nextInt();
            System.out.printf("End : ");
            int eHour = myScanner.nextInt();
            TimePeriod time = new TimePeriod(sHour, eHour);
            time.displayPeriod();
        } else {
            System.out.printf("Error Mode\n");
        }
        myScanner.close();
    }
}

class TimePeriod {
    private int startHour;
    private int endHour;

    public TimePeriod() {
        this.startHour = 9;
        this.endHour = 17;
    }

    public TimePeriod(int startHour, int endHour) {
        startHour = (startHour < 0) ? 0 : (startHour > 23) ? 23 : startHour;
        endHour = (endHour < 0) ? 0 : (endHour > 23) ? 23 : endHour;
        if (startHour > endHour) {
            startHour += endHour;
            endHour = startHour - endHour;
            startHour -= endHour;

        }
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public void displayPeriod() {
        System.out.printf("%d:00 - %d:00\n", this.startHour, this.endHour);
    }
}