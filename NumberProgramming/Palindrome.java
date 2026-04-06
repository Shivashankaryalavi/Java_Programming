/*
      Check whether given number is palindrome or not
 */
package NumberProgramming;
import java.util.Scanner;

public class Palindrome {
    static boolean  isPalindrome(int num){
        int original =num;
        int rev =0;
        while(num>0){
            int lastDigit = num%10;
            rev = rev*10+lastDigit;
            num/=10;
        }
       return rev==original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num=sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("It is Palindrome");
        }
        else{
            System.out.println("It is not Palindrome Number");
        }
        sc.close();
    }

}
