import java.util.*;
public class TimeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first Time object
        System.out.println("Enter the hours, minutes, and seconds for the first time:");
        int hour1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        int sec1 = scanner.nextInt();
        Time time1 = new Time(hour1, min1, sec1);

        // Input for the second Time object
        System.out.println("Enter the hours, minutes, and seconds for the second time:");
        int hour2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int sec2 = scanner.nextInt();
        Time time2 = new Time(hour2, min2, sec2);

        // Adding the two times and displaying the result
        time1.add(time2);
    }

}
class Time {
    private int hour;
    private int min;
    private int sec;

    // Constructor
    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    // Method to add two Time objects
    public void add(Time otherTime) {
        int totalSec = this.sec + otherTime.sec;
        int totalMin = this.min + otherTime.min + totalSec / 60;
        int totalHour = this.hour + otherTime.hour + totalMin / 60;
        totalSec %= 60;
        totalMin %= 60;
        totalHour %= 24; // Assuming a 24-hour format without considering days

        System.out.printf("Added Time: %02d:%02d:%02d\n", totalHour, totalMin, totalSec);
    }
}


