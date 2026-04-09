package NumberProgramming;

import java.util.Scanner;

public class SumOfDigits {

    static int sum(int num){
        int sum =0;
        while(num>0){
            int ld = num%10;
            sum+=ld;
            num/=10;

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println("Sum of Digit is : "+ sum(num));
        sc.close();
    }
    
}
