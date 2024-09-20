package Threading;
class Counter2 {
    private static int count = 0;
    public synchronized static void increment() { count++;
        System.out.println("Count after incrementing: " + count); }
    public synchronized static void decrement() {
        count--;
        System.out.println("Count after decrementing: " + count); }}
class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            Counter2.increment();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage()); }} }}
class MyThread3 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            Counter2.decrement();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage()); } } }}
public class Show_How_Can_Class_Object_Locked_Using_Method_Level_Synchronization {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        MyThread3 t2 = new MyThread3();
        t1.start();
        t2.start(); }
}
