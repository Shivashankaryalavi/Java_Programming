package NumberProgramming;
import java.util.Scanner;
public class SumOFEvenODDfib1 {
	
	    public static int evenSum(int n) {
	        int a = 0, b = 1;
	        int sumEven = 0;

	        for (int i = 1; i <= n; i++) {
	            if (a % 2 == 0) {
	                sumEven += a;
	            }
	            int temp = a + b;
	            a = b;
	            b = temp;
	        }
	        return sumEven;
	    }

	    public static int oddSum(int n) {
	        int a = 0, b = 1;
	        int sumOdd = 0;

	        for (int i = 1; i <= n; i++) {
	            if (a % 2 != 0) {
	                sumOdd += a;
	            }
	            int temp = a + b;
	            a = b;
	            b = temp;
	        }
	        return sumOdd;
	    }

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        System.out.print("Enter The  Range: ");
	        int n = s.nextInt();
	        System.out.println();

	        int even = evenSum(n);
	        int odd = oddSum(n);

	        System.out.println("Sum of Even Fibonacci Numbers: " + even);
	        System.out.println("Sum of Odd Fibonacci Numbers: " + odd);
	    }
	}
