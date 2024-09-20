package Threading;

public class Access_the_Priority_You_Can_Use_Method_With_Thread implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running with priority: " + Thread.currentThread().getPriority()); }
    public static void main(String[] args) {
        Access_the_Priority_You_Can_Use_Method_With_Thread runnable = new Access_the_Priority_You_Can_Use_Method_With_Thread();
        Thread thread1 = new Thread(runnable, "Thread 1");
        Thread thread2 = new Thread(runnable, "Thread 2");
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
        System.out.println(Thread.currentThread().getName() + " (main thread) priority: " + Thread.currentThread().getPriority()); }
}
