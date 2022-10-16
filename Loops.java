import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // print Perfect Pyramid
        // outerLoop
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for column * print
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            // for new
            System.out.println();
        }

    }
}

// Half pyramid with numbers
// // int n = 5;
// for (int i = 1; i <= n; i++) {

// for (int j = 1; j <= i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }
// int n = 5;

// Inverted half pyramid with numbers
// for (int i = n; i >= 1; i--) {

// for (int j = 1; j <= i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// // }
// }
// }
/*
 * System.out.println("enter range");
 * int n = sc.nextInt();
 * int m = sc.nextInt();
 * 
 * for (int i = 1; i <= n; i++) {
 * for (int j = 1; j <= m; j++) {
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 * //
 */
// }
// }