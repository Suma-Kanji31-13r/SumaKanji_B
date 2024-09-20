package Threading;
class ShResource {
    void printNumbers() {
        synchronized (this) { // Synchronized block on the current instance
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(100); // Simulate some processing time
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage()); } }} }}
class kThread extends Thread {
    private ShResource resource;
    kThread(ShResource resource, String name) {
        super(name);
        this.resource = resource; }
    public void run() {
        resource.printNumbers();}}
public class Synchronize_Threads_Acting_Same_Object_Synchronized_Block_Program_Executed {
    public static void main(String[] args) {
        ShResource sharedResource = new ShResource();
        kThread t1 = new kThread(sharedResource, "Thread-1");
        kThread t2 = new kThread(sharedResource, "Thread-2");
        t1.start();
        t2.start(); }
}
