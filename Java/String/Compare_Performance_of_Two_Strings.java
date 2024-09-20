package String;
import java.util.*;
public class Compare_Performance_of_Two_Strings {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            boolean result = str1.equals(str2); }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time taken for equals method: " + duration + " nanoseconds");
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            boolean result = (str1 == str2); }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken for == operator: " + duration + " nanoseconds"); }
}
