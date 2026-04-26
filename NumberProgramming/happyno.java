import java.util.HashSet;

public class happyno {

    // Method to check happy number
    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSquareSum(n);
        }

        return n == 1;
    }

    // Method to calculate sum of squares of digits
    public static int getSquareSum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int num = 19; // change number

        if (isHappy(num)) {
            System.out.println(num + " is a Happy Number 😊");
        } else {
            System.out.println(num + " is NOT a Happy Number ❌");
        }
    }
}