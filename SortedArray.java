
// write a java program to sort a numeric array and a string array.
import java.util.*;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input from the user n element");
        int n = sc.nextInt();
        int[] array = { n };
        array = new int[n];
        boolean isSortedNum = true;
        // enter these element to sorted
        System.out.println(" Enter these element");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        // check condition traverse in array
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSortedNum = false;
                break;
            }
        }

        if (isSortedNum) {
            System.out.println("It is sorted element");
        } else {
            System.out.println("Its not sorted element");
        }

    }
}