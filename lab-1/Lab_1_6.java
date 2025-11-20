import java.util.Scanner;

public class Lab_1_6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.printf("กรุณาเลือกแม่สูตคูณ: ");
        int num = obj.nextInt();
        for( int i=0 ; i <= 11 ; i++){
            System.out.printf("%d X %d = %d \n",num,i+1,num*(i+1));
        }
        obj.close();
    }
}
