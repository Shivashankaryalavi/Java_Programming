package NumberProgramming;
import java.util.Scanner;

public class ArmstrongNumber {
    static boolean  isarmstrong(int num){
        int original = num;
        int sum =0;
        while(num>0){
            int digit = num%10;
            sum+=(digit*digit*digit);
            num/=10;
        }
        return sum==original;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        if(isarmstrong(num)){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
        sc.close();
    }
    
}
