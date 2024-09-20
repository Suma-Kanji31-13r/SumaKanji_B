package Threading;
class Counter {
    private int count = 0;
    public void increment() {
        synchronized (this) {
            count++; } }
    public int getCount() {
        return count; }}
class UpdateThread extends Thread {
    private Counter counter;
    public UpdateThread(Counter counter) {
        this.counter = counter; }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); } }}
public class Block_Level_Synchronization {
    public static void main(String[] args) {
        Counter counter = new Counter();
        UpdateThread t1 = new UpdateThread(counter);
        UpdateThread t2 = new UpdateThread(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("A thread was interrupted."); }
        System.out.println("Final count: " + counter.getCount()); }
}
