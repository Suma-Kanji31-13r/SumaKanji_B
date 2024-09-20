package Threading;

public class Get_the_Priorities_of_Running_Threads {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " priority: " + Thread.currentThread().getPriority());
        }, "Thread 1");
        Thread thread2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " priority: " + Thread.currentThread().getPriority());
        }, "Thread 2");
        Thread thread3 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " priority: " + Thread.currentThread().getPriority());
        }, "Thread 3");
        thread1.setPriority(Thread.MIN_PRIORITY); // 1
        thread2.setPriority(Thread.NORM_PRIORITY); // 5
        thread3.setPriority(Thread.MAX_PRIORITY); // 10
        thread1.start();
        thread2.start();
        thread3.start(); }
}
