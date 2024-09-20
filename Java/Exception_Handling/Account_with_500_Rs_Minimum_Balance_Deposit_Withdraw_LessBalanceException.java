package Exception_Handling;
import java.util.*;
class LessBalanceException extends Exception {
    public LessBalanceException(String message) {
        super(message); } }
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        balance = initialBalance; }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully."); }
    public void withdraw(double amount) throws LessBalanceException {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            throw new LessBalanceException("Insufficient balance for withdrawal."); } }
    public double getBalance() {
        return balance; } }
public class Account_with_500_Rs_Minimum_Balance_Deposit_Withdraw_LessBalanceException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance for Account 1: ");
        double initialBalance1 = scanner.nextDouble();
        BankAccount account1 = new BankAccount(initialBalance1);
        System.out.print("Enter initial balance for Account 2: ");
        double initialBalance2 = scanner.nextDouble();
        BankAccount account2 = new BankAccount(initialBalance2);
        try {
            account1.deposit(100);
            account2.deposit(200);
            account1.withdraw(50);
            account2.withdraw(300);
// Uncomment the line below to test LessBalanceException:
// account1.withdraw(2000);
        } catch (LessBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Account 1 balance: Rs " + account1.getBalance());
        System.out.println("Account 2 balance: Rs " + account2.getBalance()); }
}
