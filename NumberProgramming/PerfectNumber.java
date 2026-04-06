/*
     find whether a given numer is perfect number or not
 */
package NumberProgramming;

import java.util.Scanner;

public class PerfectNumber {

    public static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i <num ; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPerfect(num)) {
            System.out.println(num +"::::::::::=======>>>>>>"+ " is a Perfect Number");
        } else {
            System.out.println(num + " is NOT a Perfect Number");
        }
        sc.close();
    }
}
