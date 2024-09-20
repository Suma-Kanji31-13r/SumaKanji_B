import java.util.*;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // Default constructor
    public Account() {
        this(0, 0);
    }

    // Constructor with specified id and initial balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Accessor and mutator methods for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Accessor and mutator methods for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Accessor and mutator methods for annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Accessor method for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    // Method to calculate and return monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // Method to calculate and return monthly interest
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    // Method to withdraw specified amount from account
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Method to deposit specified amount to account
    public void deposit(double amount) {
        balance += amount;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter id and initial balance
        System.out.println("Enter account ID:");
        int id = scanner.nextInt();
        System.out.println("Enter initial balance:");
        double balance = scanner.nextDouble();

        // Create Account object using user input
        Account account = new Account(id, balance);

        // Prompt user to enter annual interest rate
        System.out.println("Enter annual interest rate:");
        double annualInterestRate = scanner.nextDouble();
        account.setAnnualInterestRate(annualInterestRate);

        // Prompt user to enter withdrawal and deposit amounts
        System.out.println("Enter withdrawal amount:");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        System.out.println("Enter deposit amount:");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Display account details
        System.out.println("\nAccount Details:");
        System.out.println("Account ID: " + account.getId());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Annual Interest Rate: " + account.getAnnualInterestRate() + "%");
        System.out.println("Date Created: " + account.getDateCreated());
        System.out.println("Monthly Interest Rate: " + account.getMonthlyInterestRate() + "%");
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
    }
}
