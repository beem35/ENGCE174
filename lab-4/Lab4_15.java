import java.util.Arrays;
import java.util.Scanner;

public class Lab4_15 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Max : ");
        int max = myScanner.nextInt();
        AuditRecord.setMaxMessages(max);
        myScanner.nextLine();
        System.out.printf("User : ");
        String user = myScanner.nextLine();
        System.out.printf("Log : ");
        int N = myScanner.nextInt();
        AuditRecord auditRecord = new AuditRecord(user);
        myScanner.nextLine();
        for (int i = 0; i < N; i++) {
            System.out.printf("Log [%d] : ", i + 1);
            String logs = myScanner.nextLine();
            auditRecord = auditRecord.addMessage(logs);
        }
        auditRecord.displayLog();
        myScanner.close();
    }
}

class AuditRecord {

    private final String user;
    private final String[] logMessages;
    private static int maxMessages = 3;

    public AuditRecord(String user) {
        this(user, new String[0]);
    }

    public AuditRecord(String user, String[] logs) {
        this.user = user;
        int size = (logs.length > maxMessages) ? maxMessages : logs.length;
        this.logMessages = new String[size];
        int startIndex = (logs.length > maxMessages) ? (logs.length - maxMessages) : 0;
        for (int i = 0; i < size; i++) {
            this.logMessages[i] = logs[startIndex + i];
        }
    }

    public static void setMaxMessages(int max) {
        if (max > 0) {
            maxMessages = max;
            System.out.printf("Policy set to %d\n", max);
        } else {
            System.out.printf("Invalid policy.\n");
        }
    }

    public AuditRecord addMessage(String message) {
        if (this.logMessages.length < maxMessages) {
            String[] newLogs = new String[this.logMessages.length + 1];
            for (int i = 0; i < this.logMessages.length; i++) {
                newLogs[i] = this.logMessages[i];
            }
            newLogs[newLogs.length - 1] = message;
            System.out.printf("%s added.\n", message);
            return new AuditRecord(this.user, newLogs);
        } else {
            System.out.printf("Log is full.\n");
            return this;
        }
    }

    public void displayLog() {
        System.out.println("User:" + this.user + ", Logs:" + maxMessages + Arrays.toString(logMessages));
    }
}