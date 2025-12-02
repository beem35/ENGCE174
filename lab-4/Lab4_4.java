import java.util.Scanner;

public class Lab4_4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Latitude : ");
        double latitude = myScanner.nextDouble();
        System.out.printf("Longitude : ");
        double longitude = myScanner.nextDouble();
        System.out.printf("New Latitude : ");
        double newlatitude = myScanner.nextDouble();
        Location loc1 = new Location(latitude, longitude);
        Location loc2 = new Location(loc1);
        loc1.setLatitude(newlatitude);
        loc1.displayInfo();
        loc2.displayInfo();
        myScanner.close();
    }
}

class Location {
    
    private double latitude;
    private double longitude;

    
    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    
    public Location(Location other) {
        this.latitude = other.latitude;
        this.longitude = other.longitude;
    }

    
    public void setLatitude(double newLat) {
        this.latitude = newLat;
    }

    public void displayInfo() {
        System.out.printf("Lat: %f, Lon: %f\n", this.latitude, this.longitude);
    }
}