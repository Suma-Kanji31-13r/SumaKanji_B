import java.util.*;
public class _1_2_3_4_5_6_pattern_printing {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++; }
            System.out.println(); } }
}
