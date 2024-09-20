package Threading;

public class Illustrate_Thread_Example_for_getThreadGroup {

        public static void main(String[] args) {
            ThreadGroup group = new ThreadGroup("ExampleThreadGroup");
            Thread thread1 = new Thread(group, new RunnableTask(), "Thread-1");
            Thread thread2 = new Thread(group, new RunnableTask(), "Thread-2");
            Thread thread3 = new Thread(group, new RunnableTask(), "Thread-3");
            thread1.start();
            thread2.start();
            thread3.start();
            ThreadGroup tg = thread1.getThreadGroup();
            System.out.println(thread1.getName() + " belongs to the thread group: " + tg.getName());}}
    class RunnableTask implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running."); }
}
