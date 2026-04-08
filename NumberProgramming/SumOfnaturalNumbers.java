package NumberProgramming;
import java.util.Scanner;

public class SumOfnaturalNumbers {
    static void  naturalSum(int num){
        int sum=0;
        for(int i =0;i<num;i++){
            System.out.println(sum+=i);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        naturalSum(num);
        sc.close();
        
    }
    
}
