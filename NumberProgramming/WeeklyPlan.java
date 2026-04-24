package NumberProgramming;
import java.util.Scanner;

public class WeeklyPlan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch(day) {
            case 1:
                System.out.println("Monday: Study");
                break;

            case 2:
                System.out.println("Tuesday: Playing");
                break;

            case 3:
                System.out.println("Wednesday: Hotel");
                break;

            case 4:
                System.out.println("Thursday: Temple");
                break;

            case 5:
                System.out.println("Friday: Movie");
                break;

            case 6:
                System.out.println("Saturday: Weekend plan");
                break;

            case 7:
                System.out.println("Sunday: Sleeping ");
                break;

            default:
                System.out.println("Invalid day");
        }

        sc.close();
    }
}
