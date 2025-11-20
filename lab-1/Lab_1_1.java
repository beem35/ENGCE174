import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab_1_1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int numberInput_1 = 0;
        int numberInput_2 = 0;

        System.out.println("--- กรุณากรอกจำนวนเต็ม 2 จำนวน ---");
        numberInput_1 = getIntegerInput(myObj, "กรุณากรอกตัวเลขที่ 1: ");
        numberInput_2 = getIntegerInput(myObj, "กรุณากรอกตัวเลขที่ 2: ");
        System.out.println("ผลรวมคือ: " + (numberInput_1 + numberInput_2));

        myObj.close();
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
                scanner.next();
            }
        }
        return number;
    }
}