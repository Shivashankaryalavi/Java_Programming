package NumberProgramming;
import java.util.Scanner;
public class AlternativePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int count =0;
       
        for(int i =2;i<=n;i++){
           int java =0;
          for(int j=1;j<=i;j++){
            if(i%j==0){
                java++;
            }
          } 
          if(java==2){
            count++;
            if(count%2!=0){
                System.out.println(i);
            }
          } 

          
        }

        sc.close();
       
    }
}
