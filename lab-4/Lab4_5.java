import java.util.Scanner;

public class Lab4_5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Red : ");
        int red = myScanner.nextInt();
        System.out.printf("Green : ");
        int green = myScanner.nextInt();
        System.out.printf("Blue : ");
        int blue = myScanner.nextInt();
        Color color = new Color(red, green, blue);
        color.displayRGB();
        myScanner.close();
    }
}

class Color {

    private int red;
    private int green;
    private int blue;

    public Color(int r, int g, int b) {
            this.red = (r >= 0 && r <= 255)? r : (r < 0)? 0 : 255;
            this.green = (g >= 0 && g <= 255)? g : (g < 0)? 0 : 255;
            this.blue = (b >= 0 && b <= 255)? b : (b < 0)? 0 : 255;
    }

    public int getRed() {

        return this.red;
    }

    public int getGreen() {

        return this.green;
    }

    public int getBlue() {

        return this.blue;
    }

    public void displayRGB() {
        System.out.printf("R: %d, G: %d, B: %d\n",this.red,this.green,this.blue);
    }
}