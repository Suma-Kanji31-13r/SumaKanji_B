package Exception_Handling;
import java.util.*;
class NoMatchFoundException2 extends Exception {
    public NoMatchFoundException2(String message) {
        super(message); } }
public class name_of_capital_of_country_entered_command_line_noMatchFoundException {
    private static final Map<String, String> countryCapitals;
    static {
        countryCapitals = new HashMap<>();
        countryCapitals.put("United States", "Washington, D.C.");
        countryCapitals.put("Germany", "Berlin");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("United Kingdom", "London");
        countryCapitals.put("India", "New Delhi"); }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the country:");
        String country = scanner.nextLine();
        try {
            String capital = findCapital(country);
            System.out.println("The capital of " + country + " is " + capital + ".");
        } catch (NoMatchFoundException2 e) {
            System.out.println(e.getMessage()); } }
    public static String findCapital(String country) throws NoMatchFoundException2 {
        String capital = countryCapitals.get(country);
        if (capital == null) {
            throw new NoMatchFoundException2("No match found for the country: " + country); }
        return capital; }
}
