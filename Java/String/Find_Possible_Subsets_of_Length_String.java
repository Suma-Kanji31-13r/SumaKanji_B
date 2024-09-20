package String;
import java.util.*;
public class Find_Possible_Subsets_of_Length_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        System.out.println("Enter the length of subsets:");
        int length = scanner.nextInt();
        for (int i = 0; i <= str.length() - length; i++) {
            for (int j = i + length; j <= str.length(); j++) {
                System.out.println(str.substring(i, j)); } } }
}
