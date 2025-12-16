package lab6_6;

import java.util.Scanner;

public class Lab6_6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Email : ");
        String email = myScanner.nextLine();
        System.out.printf("Message : ");
        String message1 = myScanner.nextLine();
        System.out.printf("SMS : ");
        String sms = myScanner.nextLine();
        System.out.printf("Message : ");
        String message2 = myScanner.nextLine();
        EmailSender sender1 = new EmailSender();
        SMSSender sender2 = new SMSSender();
        Notifier notifier1 = new Notifier(sender1);
        notifier1.sendNotification(email, message1);
        Notifier notifier2 = new Notifier(sender2);
        notifier2.sendNotification(sms, message2);
        myScanner.close();
    }
}

interface IMessageService {
    public void send(String recipient, String message);
}

class SMSSender implements IMessageService {
    @Override
    public void send(String recipient, String message) {
        System.out.printf("Sending SMS to %s: %s \n", recipient, message);
    }
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