/*
     find largest among two number  using ternary operator
 */
package NumberProgramming;

import java.util.Scanner;

public class LargestNumber {

    public static int largest(int a, int b){
        int max = (a>b) ? a:b;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int result=largest(a, b);
        System.out.println("Maximum Number " + result);
        sc.close();
    }
    
}
