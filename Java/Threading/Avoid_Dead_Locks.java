package Threading;
class Account {
    double balance;
    void deposit(double amount) {
        synchronized (this) {
            balance += amount;
            System.out.println("Amount deposited successfully."); } }
    void withdraw(double amount) {
        synchronized (this) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Amount withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance for withdrawal."); } } }}
public class Avoid_Dead_Locks {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();
        Thread thread1 = new Thread(() -> {
            account1.deposit(100);
            account2.withdraw(50); });
        Thread thread2 = new Thread(() -> {
            account2.deposit(200);
            account1.withdraw(80); });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace(); }
        System.out.println("Final balance in Account 1: Rs " + account1.balance);
        System.out.println("Final balance in Account 2: Rs " + account2.balance); }
}
