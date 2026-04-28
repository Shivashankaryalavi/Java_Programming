package ArrayProgramming;
public class Arraymin {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};

        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Minimum = " + min);
    }
}