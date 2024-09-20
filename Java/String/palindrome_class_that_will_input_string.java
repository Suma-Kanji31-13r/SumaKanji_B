package String;
import java.util.*;
public class palindrome_class_that_will_input_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String str = scanner.nextLine();
        if (isPalindrome(str))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome."); }
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--; }
        return true;
    }
}
