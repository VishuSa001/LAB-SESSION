import java.util.*;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the years");
        int year = sc.nextInt();
        if (year % 4 == 00) {
            System.out.println(" It is a leap year");
        } else {
            System.out.println(" not a leap year");
        }

    }
}