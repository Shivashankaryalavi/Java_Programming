package NumberProgramming;

import java.util.Scanner;

public class CountDigit {
    static int countDigit(long num){
        if(num==0){
            return 1;
        }
        int count =0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        long num = sc.nextLong();
        System.out.println("Count of Digits is : "+ countDigit(num));
        sc.close();
    }
    
}
