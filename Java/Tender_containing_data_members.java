import java.util.*;
public class Tender_containing_data_members {
    private double cost;
    private String companyName;

    // Constructor to initialize the cost and companyName
    public Tender_containing_data_members(double cost, String companyName) {
        this.cost = cost;
        this.companyName = companyName;
    }

    // Getter for cost
    public double getCost() {
        return cost;
    }

    // Getter for companyName
    public String getCompanyName() {
        return companyName;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tender_containing_data_members[] tenders = new Tender_containing_data_members[5]; // Array to store 5 Tender objects

        // Accepting input for each tender
        for (int i = 0; i < tenders.length; i++) {
            System.out.println("Enter company name and cost for tender " + (i + 1) + ":");
            String companyName = scanner.next();
            double cost = scanner.nextDouble();
            tenders[i] = new Tender_containing_data_members(cost, companyName); // Creating new Tender object
        }

        // Finding the tender with minimum cost
        double minCost = Double.MAX_VALUE;
        String minCostCompanyName = "";
        for (Tender_containing_data_members tender : tenders) {
            if (tender.getCost() < minCost) {
                minCost = tender.getCost();
                minCostCompanyName = tender.getCompanyName();
            }
        }

        // Displaying the company name of the tender with the minimum cost
        System.out.println("Company with the minimum cost tender: " + minCostCompanyName);
    }
}
