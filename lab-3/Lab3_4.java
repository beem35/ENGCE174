import java.util.Scanner;

public class Lab3_4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Number list : ");
        int N = myScanner.nextInt();
        for(int i = 0 ; i < N ; i++){
            myScanner.next();
            System.out.printf("[%d]Name : ",i+1);
            String name = myScanner.nextLine();
            ProductV2 product = new ProductV2(name);
        }
        System.out.printf("Product count : %d",ProductV2.getProductCount());
    }
}

class ProductV2 {
    private String name;
    private static int productCount = 0;

    public ProductV2(String name){
        this.name = name;
        productCount++;
    }
    
    public String getName(){
        return name;
    }

    public static int getProductCount(){
        return productCount;
    }
}