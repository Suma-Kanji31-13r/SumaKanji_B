import java.util.*;
public class _1_1_2_2_3_3_4_pattern_printing {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" "); }
            System.out.print(i);
            int spaces = 2 * (n - i) - 1;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" "); }
            if (i != n) {
                System.out.print(i); }
            System.out.println(); } }
}
