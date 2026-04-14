import java.util.Scanner;
public class Positive {
    static String positive(int num){
        if(num>0){
            return "Positive";
        }
        else if (num==0){
            return "Zero";
        }
        return  "Negative";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println(positive(num));
        sc.close();
    }
}
