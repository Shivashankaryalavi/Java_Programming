import java. util.Scanner;
public class Even {
    public static void EvenOdd(int n){
        for(int i = 1;i<=n;i++){
            if (i%2==0) {
                  
                System.out.print(i);
                if(i==n){
                    break;
                }
                System.out.print(",");
              
                
            }
        }
        System.out.println("are Even numbers");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nummber :");
        int n = sc.nextInt();
        EvenOdd(n);
        
    }
}
