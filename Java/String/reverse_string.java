package String;
import java.util.*;
public class reverse_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str = scanner.nextLine();
        String reversedString = reverseString(str);
        System.out.println("Reversed string: " + reversedString); }
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i)); }
        return reversed.toString(); }
}
