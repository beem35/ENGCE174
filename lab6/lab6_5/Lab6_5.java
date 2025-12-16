package lab6_5;

import java.util.Scanner;

public class Lab6_5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Email : ");
        String email = myScanner.nextLine();
        System.out.printf("Message : ");
        String message = myScanner.nextLine();
        EmailSender sender = new EmailSender();
        Notifier notifier = new Notifier(sender);
        notifier.sendNotification(email, message);
        myScanner.close();
    }
}

interface IMessageService {
    public void send(String recipient, String message);
}

class EmailSender implements IMessageService {
    @Override
    public void send(String recipient, String message) {
        System.out.printf("Sending Email to %s: %s \n", recipient, message);
    }
}

class Notifier {
    private IMessageService service;

    public Notifier(IMessageService service) {
        this.service = service;
    }

    public void sendNotification(String recipient, String message) {
        service.send(recipient, message);
    }
}
