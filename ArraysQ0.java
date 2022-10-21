
//Q.write a java program to find the maximum  value of array .
import java.util.Scanner;

public class ArraysQ0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = { n };
        arr = new int[n];
        int max = 0;
        // //for size of memory
        System.out.println(" Enter these elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // condition for maximum num of element print
        for (int e : arr) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this arrayis:" + max);
        System.out.println(Integer.MAX_VALUE);
    }
}
// import java.util.Scanner;

// public class ArraysQ0 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter size of array");
// int n = sc.nextInt();
// int[] arr = { n };
// arr = new int[n];
// int max = Integer.MAX_VALUE;
// // //for size of memory
// System.out.println(" Enter these elements");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// // condition for maximum num of element print
// for (int e : arr) {
// if (e > max) {
// max = e;
// }
// }
// // System.out.println("the value of the maximum element in this arrayis:" +
// // max);
// System.out.println(Integer.MAX_VALUE);

// }
// }