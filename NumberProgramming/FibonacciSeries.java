/*
    Print the Fibonacci series from 1 to any range
 */
package NumberProgramming;
import java.util.Scanner;
public class FibonacciSeries {
    public static void fib(int n){
        int a =0;
        int b =1;
        for(int i =0;i<n;i++){
            System.out.print(a+" ");
            int next = a+b;
            a=b;
            b=next;
         
        }
     
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    fib(sc.nextInt());
    sc.close();
    
  }
}
