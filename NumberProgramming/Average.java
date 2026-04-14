import java.util.Scanner;
public class Average {
    static double average(int num){
        if(num==0) return 0;
        int sum = 0;
        int count =0;
        while(num>0){
            int ld = num%10;
            sum+=ld;
            num/=10;
            count++;
        }
        return (double) sum/count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println(average(num));
        sc.close();
    }
    
}
