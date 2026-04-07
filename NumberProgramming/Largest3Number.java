package NumberProgramming;
import java.util.Scanner;

public class Largest3Number {

    static int largest(int a,int b,int c,int d){
       int max= (a>b&&a>c&&a>d)?a:(b>c&&b>d)?b:(c>d)?c:d;
        return  max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number2");
        int b = sc.nextInt();
        System.out.println("Enter number3");
        int c = sc.nextInt();
        System.out.println("Enter number4");
        int d = sc.nextInt();
        int result=(largest(a, b, c,d));
        System.out.println("Maximum Number "+ result);

        sc.close();
        
    }
    
}
