import java.util.Scanner;
public class NeonNumber {
    static boolean  isneon(int num){
        int original = num;
        int square = num*num;
        int sum =0;
        while(square>0){
            int ld = square%10;
            sum+=ld;
            square/=10;
        }
        return sum==original;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        
        if(isneon(num)){
            System.out.println("Neon number");
        }
        else{
            System.out.println("Not neon number");
        }
        sc.close();
    }
}
