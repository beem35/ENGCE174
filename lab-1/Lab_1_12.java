import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab_1_12 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int N = getIntegerInput(myScanner, "กรุณากรอกจำนวนชนิดของสินค้า : ");
        int[] idProduct = new int[N];
        int[] stock = new int[N];
        boolean ishave = false;
        for (int i = 0; i < N; i++) {
            idProduct[i] = getIntegerInput(myScanner, "กรุณากรอก ID : ");
            stock[i] = getIntegerInput(myScanner, "กรุณากรอก Stock : ");
        }
        int idSearch = getIntegerInput(myScanner, "กรุณากรอก ID เพื่อค้าหา : ");
        for (int i = 0; i < N; i++) {
            ishave = false;
            if (idSearch == idProduct[i]) {
                System.out.printf("ของใน Stock : %d", stock[i]);
                ishave = true;
                break;
            }
        }
        if (ishave == false) {
            System.out.printf("Product %d not found", idSearch);
        }
        myScanner.close();
    }

    public static int getIntegerInput(Scanner scanner, String prompt) {
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            try {
                number = scanner.nextInt();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("[ข้อผิดพลาด] คุณใส่ตัวอักษร กรุณาใส่เฉพาะตัวเลขจำนวนเต็มเท่านั้น!");
                scanner.nextLine();
            }
        }
        return number;
    }
}
