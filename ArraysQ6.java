// //Q.write a java program to find the minimum  value of array .

import java.util.Scanner;

public class ArraysQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = { n };
        arr = new int[n];
        int min = 0;
        // //for size of memory
        System.out.println(" Enter these elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // condition for minimum num of element print
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("the value of the minimum element in this arrayis:" + min);
        System.out.println(Integer.MIN_VALUE);
        // System.out.println("the value of the minimum element in this arrayis:" +
        // Integer.MAX_VALUE);

    }
}