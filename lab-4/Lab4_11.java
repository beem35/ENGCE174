import java.util.Scanner;

public class Lab4_11 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Base Theme : ");
        String themeBase = myScanner.nextLine();
        System.out.printf("Base Font Size : ");
        int fontBase = myScanner.nextInt();
        System.out.printf("Base Dark Mode : ");
        boolean modeBase = myScanner.nextBoolean();
        myScanner.nextLine();
        System.out.printf("User Theme : ");
        String themeUser = myScanner.nextLine();
        System.out.printf("User Font Size : ");
        int fontUser = myScanner.nextInt();
        System.out.printf("User Dark Mode : ");
        boolean modeUser = myScanner.nextBoolean();
        Configuration baseConfig = new Configuration(themeBase, fontBase, modeBase);
        Configuration userConfig = new Configuration(themeUser, fontUser, modeUser);
        Configuration finalConfig = new Configuration(baseConfig, userConfig);
        finalConfig.displaySettings();
        myScanner.close();
    }
}

class Configuration {

    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    public Configuration(String theme, int fontSize, boolean darkMode) {
        fontSize = (fontSize > 20) ? 20 : (fontSize < 10) ? 10 : fontSize;
        this.theme = theme;
        this.fontSize = fontSize;
        this.darkMode = darkMode;
    }

    public Configuration(Configuration base, Configuration user) {
        this.theme = user.theme;
        this.darkMode = user.darkMode;
        this.fontSize = base.fontSize;
    }

    public void displaySettings() {
        System.out.printf("Theme: %s, Size: %d, Dark: %b\n", this.theme, this.fontSize, this.darkMode);
    }
}