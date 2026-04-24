package NumberProgramming;
import java.util.Scanner;
public class Automorphic {
    static boolean isautomorphic(int num){
        int original = num%10;
        int square = num*num;

        int ld = square%10;
        return ld==original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        if(isautomorphic(num)){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not Automorphivc number");
        }
        sc.close();

    }
}
