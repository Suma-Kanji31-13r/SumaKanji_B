package String;
import java.util.*;
public class merge_two_strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        String mergedString = str1 + str2;
        System.out.println("Merged string: " + mergedString); }
}
