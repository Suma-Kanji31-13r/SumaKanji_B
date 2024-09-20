package Array_constructor_matrix;
import java.util.*;
public class Commission {
    private double sales;
    public Commission(double sales) {
        this.sales = sales;
    }
    public double commission() {
        if (sales >= 0) {
            if (sales <= 100) {
                return sales * 0.05;
            } else if (sales <= 500) {
                return sales * 0.08;
            } else {
                return sales * 0.10;
            }
        } else {
            return -1; } }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sales amount: ");
        double sales = scanner.nextDouble();
        scanner.close();
        if (sales >= 0) {
            Commission commission = new Commission(sales);
            double commissionAmount = commission.commission();
            if (commissionAmount == -1) {
                System.out.println("Invalid Input");
            } else {
                System.out.println("Commission: " + commissionAmount);
            }
        } else {
            System.out.println("Invalid Input");} }
}
