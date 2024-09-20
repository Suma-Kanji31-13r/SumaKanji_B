package Threading;
class MyThread1 extends Thread {
    private static int counter = 0;
    public synchronized void run() {
        for (int i = 0; i < 10000; i++) {
            counter++; }
        System.out.println("Thread " + Thread.currentThread().getName() + " finished. Counter: " + counter); }}
public class Check_Whether_Define_run_Method_as_Synchronized {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread1 thread2 = new MyThread1();
        thread1.start();
        thread2.start(); }
}
