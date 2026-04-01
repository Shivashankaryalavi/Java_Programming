package NumberProgramming;
import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci(int num){
            int first =0;
            int second =1;
            for(int i =0;i<num ;i++){
                
                System.out.print(first+" ");
                int next = first+second;
                first=second;
                second=next;
            
            }
          
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        fibonacci(num);
        sc.close();
    }
}
