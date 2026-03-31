import java.util.Scanner;
public class EvenOrOdd {

    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(isEven(num));
        sc.close();
    }
    
}
