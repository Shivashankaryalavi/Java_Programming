package NumberProgramming;
import java.util.Scanner;
public class SpyNumber {
    static boolean  isspyNum(int num){
        int sum =0;
        int prod =1;
        while(num>0){
            int ld = num%10;
             prod*=ld;
             sum+=ld;
             num/=10;
        }
        return prod == sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        if(isspyNum(num)){
            System.out.println("Spy number");
        }
        else{
            System.out.println("Not spy number");
        }
        sc.close();
    }
    
}
