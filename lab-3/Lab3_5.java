import java.util.Scanner;

public class Lab3_5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Databese Name : ");
        String dbname = myScanner.nextLine();
        DatabaseConnection dbconnect = new DatabaseConnection(dbname);
        dbconnect.connect();
        dbconnect.disconnect();
        dbconnect.disconnect();
        System.out.printf("isConnected : %b ", dbconnect.isConnected());
        myScanner.close();
    }
}

class DatabaseConnection {
    private String connectionString;
    private boolean connected;

    public DatabaseConnection(String connectioString) {
        this.connectionString = connectioString;
        this.connected = false;
    }

    public boolean isConnected() {
        return this.connected;
    }

    public void connect() {
        if (this.connected == false) {
            this.connected = true;
            System.out.printf("Connected to %s\n", this.connectionString);
        } else {
            System.out.printf("Already connected.\n");
        }
    }

    public void disconnect() {
        if (this.connected == true) {
            this.connected = false;
            System.out.printf("Disconnected.\n");
        } else {
            System.out.printf("Already disconnected.\n");
        }
    }
}