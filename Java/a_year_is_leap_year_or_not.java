import java.util.*;
public class a_year_is_leap_year_or_not {
    public static void main(String[] args) { Scanner scanner = new Scanner(System.in); System.out.print("Enter a year: "); int year = scanner.nextInt(); boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); if (isLeapYear) { System.out.println(year + " is a leap year."); } else { System.out.println(year + " is not a leap year.");} }
}
