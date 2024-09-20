import java.util.*;
public class sum_of_number_formed_by_consecutive_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.next();
        int sum = 0;
        StringBuilder expression = new StringBuilder();

        // Iterate through the string but stop one character before the last to avoid IndexOutOfBounds
        for (int i = 0; i < input.length() - 1; i++) {
            // Form a number with the current and the next digit
            String numStr = input.charAt(i) + "" + input.charAt(i + 1);
            int num = Integer.parseInt(numStr);
            sum += num;

            // Build the expression string
            expression.append(numStr);
            if (i < input.length() - 2) { // Ensure we don't add a plus after the last pair
                expression.append("+");
            }
        }

        // Append '=' and the sum to the expression
        expression.append("=").append(sum);

        System.out.println("Output: " + expression);
    }
}
