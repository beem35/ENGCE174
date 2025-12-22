package lab7.lab7_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab7_15 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("ID Bot[1]: ");
        String botid1 = myScanner.nextLine();
        System.out.print("ID Bot[2]: ");
        String botid2 = myScanner.nextLine();
        System.out.print("initialPrice: ");
        double initialPrice = myScanner.nextDouble();
        System.out.print("newPrice 1: ");
        double p1 = myScanner.nextDouble();
        System.out.print("setThreshold : ");
        double set = myScanner.nextDouble();
        System.out.print("newPrice 2: ");
        double p2 = myScanner.nextDouble();
        System.out.print("newPrice 3: ");
        double p3 = myScanner.nextDouble();
        PriceFeed.setThreshold(5.0);
        PriceFeed market = new PriceFeed(initialPrice);
        TradingBot bot1 = new TradingBot(botid1);
        market.register(bot1);
        TradingBot bot2 = new TradingBot(botid2);
        market.register(bot2);
        market.setPrice(p1);
        PriceFeed.setThreshold(set);
        market.setPrice(p2);
        market.setPrice(p3);
        myScanner.close();
    }
}

interface IPriceObserver {
    public void priceUpdate(double oldPrice, double newPrice);
}

class TradingBot implements IPriceObserver {
    protected String botId;

    public TradingBot(String botId) {
        this.botId = botId;
    }

    @Override
    public void priceUpdate(double oldPrice, double newPrice) {
        System.out.printf("Bot: %s trades! Price moved from %.2f to %.2f\n", this.botId, oldPrice, newPrice);
    }
}

class PriceFeed {
    private double currentPrice;
    private java.util.ArrayList<IPriceObserver> observers;
    private static double alertThreshold = 5.0;

    public PriceFeed(double initialPrice) {
        this.currentPrice = initialPrice;
        this.observers = new ArrayList<>();
    }

    public void register(IPriceObserver observer) {
        this.observers.add(observer);
    }

    public static void setThreshold(double threshold) {
        if (threshold > 0) {
            alertThreshold = threshold;
        }
    }

    public void setPrice(double newPrice) {
        double change = newPrice - this.currentPrice;
        if (Math.abs(change) >= alertThreshold) {
            notifyObservers(newPrice);
            this.currentPrice = newPrice;
        } else {
            System.out.printf("Change too small. No notification sent.\n");
        }
    }

    private void notifyObservers(double newPrice) {
        for (int i = 0; i < this.observers.size(); i++) {
            this.observers.get(i).priceUpdate(this.currentPrice, newPrice);
        }
    }
}