package NumberProgramming;
import java.util.Scanner;

public class AlternativeEvenNumber {
    public static void even(int num){
        for(int i =0;i<=num;i+=4){
            
            if(num%2==0){
                System.out.print(i);
            }
            if(i+4<num){
           
            System.out.print(",");
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        even(num);
        sc.close();


    }
}
