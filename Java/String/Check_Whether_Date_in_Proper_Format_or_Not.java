package String;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class Check_Whether_Date_in_Proper_Format_or_Not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (format YYYY-MM-DD): ");
        String dateString = scanner.nextLine();

        // Define the expected date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            // Attempt to parse the date string
            LocalDate date = LocalDate.parse(dateString, formatter);
            System.out.println("The date is in the proper format: " + date);
        } catch (DateTimeParseException e) {
            System.out.println("The date is not in the proper format.");
        }
    }
}
