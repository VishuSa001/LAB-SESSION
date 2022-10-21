import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String arr = sc.next();
        char a[] = arr.toCharArray();
        System.out.println("Reverse of a String is ");
        int i = a.length;
        for (int j = i; j > 0; j++) {
            System.out.println(a[j - 1]);
        }
    }
}