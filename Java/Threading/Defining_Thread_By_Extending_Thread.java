package Threading;
class MThread extends Thread {
    public void run() {
        System.out.println("The thread " + Thread.currentThread().getName() + " is running.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " has been interrupted.");} } }}
public class Defining_Thread_By_Extending_Thread {
    public static void main(String[] args) {
        MThread thread1 = new MThread();
        MThread thread2 = new MThread();
        thread1.setName("MyThread-1");
        thread2.setName("MyThread-2");
        System.out.println("Starting threads");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted."); }
        System.out.println("Threads have finished execution."); }
}
