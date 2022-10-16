import java.util.*;

public class ReversePyramid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // print PerfectReverse Pyramid
        // outerLoop
        for (int i = n; i >= 1; i--) {
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