package NumberProgramming;
import java.util.Scanner;

public class ProductOfNatural {
    static void prodnatural(int num){
        int prod =1;
        for(int i =1;i<num;i++){
          System.out.println(prod*=i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        prodnatural(num);
        sc.close();
    }
    
}
