package Threading;
class MyThread extends Thread {
    public MyThread(String name) {
        super(name); }
        public void run() {
        System.out.println("Running thread: " + this.getName() + ", Priority: " + this.getPriority()); }
}
public class total_4_threads_should_run_Set_different_priorities {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
    MyThread t2 = new MyThread("Thread 2");
    MyThread t3 = new MyThread("Thread 3");
    MyThread t4 = new MyThread("Thread 4");
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.NORM_PRIORITY);
    t3.setPriority(Thread.MAX_PRIORITY);
    t4.setPriority(7);
    t1.start();
    t2.start();
    t3.start();
    t4.start(); }
}
