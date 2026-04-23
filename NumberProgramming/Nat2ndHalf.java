package NumberProgramming;


import java.util.Scanner;

public class Nat2ndHalf {

    public static void SecondHalf(int n) {
        int half = n / 2;

        for (int i = half + 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int n = s.nextInt();

        System.out.print("Natural numbers from 2nd half of " + n + " are: ");
         SecondHalf(n);
    }
}
