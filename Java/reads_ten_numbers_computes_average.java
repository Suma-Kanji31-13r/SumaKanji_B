import java.util.*;
public class reads_ten_numbers_computes_average {
    private double[] numbers = new double[10];
    private double average;
    public void readNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < this.numbers.length; i++) {
            this.numbers[i] = scanner.nextDouble(); } }
    public void computeAverage() {
        double sum = 0;
        for (double number : this.numbers) {
            sum += number; }
        this.average = sum / this.numbers.length; }
    public int numbersAboveAverage() {
        int count = 0;
        for (double number : this.numbers) {
            if (number > this.average) {
                count++; } }
        return count; }
    public void displayResults() {
        System.out.printf("The average is: %.2f\n", this.average);
        System.out.println("Number of elements above the average: " + numbersAboveAverage()); }
    public static void main(String[] args) {
        reads_ten_numbers_computes_average stats = new reads_ten_numbers_computes_average();
        stats.readNumbers();
        stats.computeAverage();
        stats.displayResults(); }
}
