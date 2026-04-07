package NumberProgramming;
import java.util.Scanner;

public class Largest3Number {

    static int largest(int a,int b,int c){
       int max= (a>b&&a>c)?a:(b>c)?b:c;
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
        int result=(largest(a, b, c));
        System.out.println("Maximum Number "+ result);

        sc.close();
        
    }
    
}
