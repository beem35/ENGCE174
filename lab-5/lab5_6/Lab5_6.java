package lab5_6;

import java.util.Scanner;

public class Lab5_6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Title Video: ");
        String title1 = myScanner.nextLine();
        System.out.print("Duration: ");
        int duration = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("Title Audio: ");
        String title2 = myScanner.nextLine();
        System.out.print("Quality: ");
        String quality = myScanner.nextLine();
        Video video = new Video(title1, duration);
        Audio audio = new Audio(title2, quality);
        Processor.runProcessor(video);
        Processor.runProcessor(audio);
        myScanner.close();
    }
}

class Media {
    protected String title;

    public Media(String title) {
        this.title = title;
    }

    public void process() {
        System.out.println("Staring generic media processing");
    }
}

class Video extends Media {
    protected int duration;

    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    @Override
    public void process() {
        System.out.println("Processing video: " + this.title + " for " + this.duration + " minutes.");
    }
}

class Audio extends Media {
    protected String quality;

    public Audio(String title, String quality) {
        super(title);
        this.quality = quality;
    }

    @Override
    public void process() {
        System.out.println("Processing audio: " + this.title + " with " + this.quality + " quality.");
    }
}

class Processor {
    public static void runProcessor(Media m) {
        m.process();
    }
}