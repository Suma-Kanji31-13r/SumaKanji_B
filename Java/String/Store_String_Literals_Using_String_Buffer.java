package String;
import java.util.*;
public class Store_String_Literals_Using_String_Buffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();

        System.out.println("Enter string literals (type 'end' to finish):");

        while(true) {
            String input = scanner.nextLine();

            // Check if user wants to end input
            if("end".equalsIgnoreCase(input)) {
                break;
            }

            // Append the user input to the StringBuffer
            stringBuffer.append(input);
            // Optionally, you can add a space or newline after each input for better readability
            stringBuffer.append("\n"); // append a newline after each input for separation
        }

        System.out.println("The combined string literals are:");
        System.out.println(stringBuffer.toString());
    }
}
