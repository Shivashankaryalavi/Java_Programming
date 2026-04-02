/*
    Find  whether a number is a strong number 
 */
package NumberProgramming;
import java.util.Scanner;
public class StrongNumber {
        // for find factorial
        public static int factorial(int n){
            int fact =1;
          
            for(int i=1;i<=n;i++){
                fact = fact *i;
            }
            return fact;
        }
        public static boolean isStrong(int num){
            int original =num;
            int sum =0;
            while(num>0){
                 int digit=num%10;
                sum+=factorial(digit);
                num/=10;  
            }
            if(original==sum){
            return true;
            }
        return false;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int num = sc.nextInt();
            System.out.println(isStrong(num));
            sc.close();
        }
        
    
}