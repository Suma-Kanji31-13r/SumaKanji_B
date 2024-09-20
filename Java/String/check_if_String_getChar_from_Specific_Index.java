package String;
import java.util.*;
public class check_if_String_getChar_from_Specific_Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();
        System.out.println("Enter the substring:");
        String subString = scanner.nextLine();
        System.out.println("Enter the index:");
        int index = scanner.nextInt();
        if (mainString.substring(index, index + subString.length()).equals(subString)) {
            System.out.println("Yes, the substring exists from the given index.");
        } else {
            System.out.println("No, the substring doesn't exist from the given index."); } }
}
