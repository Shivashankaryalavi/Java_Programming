package NumberProgramming;
import java.util.Scanner;
public class BuzzNumber {
    static boolean buzz(int num){
        int digit = num%10;
        if(digit%7==0 || num%7==0 ){
            return true;
        }
        return false;
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        if(buzz(num)){
            System.out.println("Its buzz number");
        }
        else{
            System.out.println("Its not buzz number");
        }
        sc.close();
    }
}
