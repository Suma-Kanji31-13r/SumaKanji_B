package Interface;
abstract class Asset {
    String descriptor;
    String date;
    double current_value;
    public abstract void displayDetails(); }
class Stock extends Asset {
    int num_shares;
    double share_price;
    String asset;
    public void displayDetails() {
        System.out.println("Asset Type: Stock");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: $" + current_value);
        System.out.println("Number of Shares: " + num_shares);
        System.out.println("Share Price: $" + share_price);
        System.out.println("Asset: " + asset); } }
class Bond extends Asset {
    double interest_rate;
    String asset;
    public void displayDetails() {
        System.out.println("Asset Type: Bond");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: $" + current_value);
        System.out.println("Interest Rate: " + interest_rate + "%");
        System.out.println("Asset: " + asset); } }
class Savings extends Asset {
    double interest_rate;
    String asset;
    public void displayDetails() {
        System.out.println("Asset Type: Savings");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: $" + current_value);
        System.out.println("Interest Rate: " + interest_rate + "%");
        System.out.println("Asset: " + asset); } }
public class Diagram_Asset_class_abstract_class_containing_displayDetails {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.descriptor = "Apple Inc.";
        stock.date = "2023-03-27";
        stock.current_value = 145.75;
        stock.num_shares = 100;
        stock.share_price = 145.75;
        stock.asset = "AAPL";
        stock.displayDetails();
        System.out.println();
        Bond bond = new Bond();
        bond.descriptor = "US Treasury Bond";
        bond.date = "2022-06-15";
        bond.current_value = 10000.0;
        bond.interest_rate = 3.5;
        bond.asset = "T-Bond";
        bond.displayDetails();
        System.out.println();
        Savings savings = new Savings();
        savings.descriptor = "High-Yield Savings Account";
        savings.date = "2021-01-01";
        savings.current_value = 25000.0;
        savings.interest_rate = 2.1;
        savings.asset = "Savings";
        savings.displayDetails(); }
}
