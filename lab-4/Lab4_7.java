import java.util.Scanner;

public class Lab4_7 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("id 1 : ");
        String id1 = myScanner.nextLine();
        System.out.printf("id 2 : ");
        String id2 = myScanner.nextLine();
        System.out.printf("id 2 : ");
        String id3 = myScanner.nextLine();
        Resource r1 = new Resource(id1);
        Resource r2 = new Resource(id2);
        Resource r3 = new Resource(id3);
        r1.getid();
        r2.getid();
        r3.getid();
        r1 = null;
        r2 = null;
        System.gc();
        r3 = null;
        System.gc();
        myScanner.close();
    }
}

class Resource {

    private String id;

    public Resource(String id) {
        this.id = id;
        System.out.printf("Resource [%s] created\n", id);
    }

    public String getid() {
        return this.id;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.printf("Resource [%s] finalized (destroyed).\n", id);
    }
}