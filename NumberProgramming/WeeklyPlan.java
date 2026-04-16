import java.util.Scanner;

public class WeeklyPlan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch(day) {
            case 1:
                System.out.println("Monday: Study Java Basics");
                break;

            case 2:
                System.out.println("Tuesday: Practice DSA Arrays");
                break;

            case 3:
                System.out.println("Wednesday: Learn SQL Queries");
                break;

            case 4:
                System.out.println("Thursday: Practice Coding Problems");
                break;

            case 5:
                System.out.println("Friday: Revise Java + SQL");
                break;

            case 6:
                System.out.println("Saturday: Mini Project / GitHub Upload");
                break;

            case 7:
                System.out.println("Sunday: Mock Test + Revision");
                break;

            default:
                System.out.println("Invalid day! Enter 1 to 7 only.");
        }

        sc.close();
    }
}
