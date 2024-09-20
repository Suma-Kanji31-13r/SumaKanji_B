package Interface;
import java.util.*;
interface Bank {
    void displayBankDetails(); }
class Customer {
    String customerName;
    int customerId;
    Customer(String customerName, int customerId) {
        this.customerName = customerName;
        this.customerId = customerId; }
    void displayCustomerDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName); } }
class Account {
    String accountNumber;
    double balance;
    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance; }
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance); } }
class BankingService implements Bank {
    Customer customer;
    Account account;
    String bankName;
    BankingService(Customer customer, Account account, String bankName) {
        this.customer = customer;
        this.account = account;
        this.bankName = bankName; }
    public void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
        customer.displayCustomerDetails();
        account.displayAccountDetails(); } }
public class Multiple_Inheritance_Bank_Interface_Customer_Account_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Bank Name:");
        String bankName = scanner.nextLine();
        System.out.println("Enter Customer Name:");
        String customerName = scanner.nextLine();
        System.out.println("Enter Customer ID:");
        int customerId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Account Number:");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter Account Balance:");
        double balance = scanner.nextDouble();
        Customer customer = new Customer(customerName, customerId);
        Account account = new Account(accountNumber, balance);
        BankingService bankingService = new BankingService(customer, account, bankName);
        bankingService.displayBankDetails(); }
}
