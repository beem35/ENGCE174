package lab7.lab7_14;

import java.util.Scanner;

public class Lab7_14 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = myScanner.nextLine();
        System.out.print("SeatNumber: ");
        int seat = myScanner.nextInt();
        BookingController book = new BookingController();
        System.out.println(book.bookTicket(name, seat));
        myScanner.close();
    }
}

class Ticket {
    protected String movieName;
    protected int seatNumber;

    public Ticket(String name, int seatNumber) {
        this.movieName = name;
        this.seatNumber = seatNumber;
    }

    public String getDetails() {
        return "Movie: " + this.movieName + ", Seat: " + this.seatNumber;
    }
}

class BookingController {
    public String bookTicket(String movieName, int seatNumber) {
        Ticket ticket = new Ticket(movieName, seatNumber);
        System.out.printf("Booking successful for: %s\n", ticket.getDetails());
        return ticket.getDetails();
    }
}