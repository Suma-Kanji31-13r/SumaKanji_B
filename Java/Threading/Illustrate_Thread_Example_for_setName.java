package Threading;

public class Illustrate_Thread_Example_for_setName extends Thread {
    public void run() {
        System.out.println("Running thread name: " + Thread.currentThread().getName()); }
    public static void main(String[] args) {
        Illustrate_Thread_Example_for_setName thread1 = new Illustrate_Thread_Example_for_setName();
        Illustrate_Thread_Example_for_setName thread2 = new Illustrate_Thread_Example_for_setName();
        thread1.setName("CustomThread-1");
        thread2.setName("CustomThread-2");
        thread1.start();
        thread2.start(); }
}
