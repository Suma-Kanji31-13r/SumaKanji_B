import java.util.*;
public class value_of_apple_sales_each_day_of_week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] sales = new float[7];
        float sum = 0;
        System.out.println("Enter the apple sales for each day of the week:");
        for(int i = 0; i < 7; i++) {
            System.out.printf("Day %d: ", i + 1);
            sales[i] = scanner.nextFloat();
            sum += sales[i];
            }
            float average = sum / 7;
            System.out.printf("The average sale of the week is: %.2f", average); }
}

