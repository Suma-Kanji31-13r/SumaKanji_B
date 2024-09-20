import java.util.*;
public class investment_amount_future_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the investment amount (e.g., 1000): ");
        double investmentAmount = scanner.nextDouble();
        System.out.print("Enter annual interest rate (e.g., 9%): ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        System.out.println("The amount invested: " + investmentAmount);
        System.out.println("Annual interest rate: " + annualInterestRate + "%");
        System.out.println("Years\tFuture Value");
        for (int years = 1; years <= 30; years++) {
            double futureValue = calculateFutureValue(investmentAmount, monthlyInterestRate, years);
            System.out.printf("%d\t%.2f\n", years, futureValue); }
        scanner.close(); }
    public static double calculateFutureValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12); }
}
