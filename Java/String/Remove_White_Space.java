package String;
import java.util.*;
public class Remove_White_Space {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with spaces:");
        String str = scanner.nextLine();
        String stringWithoutSpaces = str.replaceAll("\\s", "");
        System.out.println("String after removing spaces: " + stringWithoutSpaces);}
}
