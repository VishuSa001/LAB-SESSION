public class ReverseNumber {
    public static void main(String[] args) {
        int[] marks = { 56, 65, 43, 87, 54 };
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
    }
}