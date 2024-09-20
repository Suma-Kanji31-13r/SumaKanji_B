package Interface;
import java.util.*;
abstract class Accounts {
    protected double balance;
    protected String accountNumber;
    protected String accountHoldersName;
    protected String address;
    public Accounts(double balance, String accountNumber, String accountHoldersName, String address) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address; }
    abstract void withdrawal(double amount);
    abstract void deposit(double amount);
    void display() {
        System.out.println("Balance for account number " + accountNumber + " is: " + balance); } }
class SavingsAccount extends Accounts {
    private double rateOfInterest;
    public SavingsAccount(double balance, String accountNumber, String accountHoldersName, String address, double rateOfInterest) {
        super(balance, accountNumber, accountHoldersName, address);
        this.rateOfInterest = rateOfInterest; }
    void withdrawal(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds."); } }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance); }
    void calculateAmount() {
        double interest = (balance * rateOfInterest) / 100;
        System.out.println("Interest amount: " + interest);
        balance += interest; } }
public class AccountManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account holder's name, account number, address, initial balance and rate of interest:");
        String name = scanner.nextLine();
        String accountNumber = scanner.nextLine();
        String address = scanner.nextLine();
        double balance = scanner.nextDouble();
        double interestRate = scanner.nextDouble();
        SavingsAccount account = new SavingsAccount(balance, accountNumber, name, address, interestRate);
        System.out.println("Choose an operation:\n1. Deposit\n2. Withdrawal\n3. Calculate Interest\n4. Display Balance");
        int choice = scanner.nextInt();
        double amount;
        switch (choice) {
            case 1:
                System.out.println("Enter amount to deposit:");
                amount = scanner.nextDouble();
                account.deposit(amount);
                break;
            case 2:
                System.out.println("Enter amount to withdraw:");
                amount = scanner.nextDouble();
                account.withdrawal(amount);
                break;
            case 3:
                account.calculateAmount();
                System.out.println("New balance after interest: " + account.balance);
                break;
            case 4:
                account.display();
                break;
            default:
                System.out.println("Invalid choice.");
                break; } }
}
