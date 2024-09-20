package Threading;

public class Set_the_Priority_of_Thread {
    public static void main(String[] args) {
        Thread firstThread = new Thread(() -> {
            System.out.println("First thread is running.");
        }, "First Thread");
        Thread secondThread = new Thread(() -> {
            System.out.println("Second thread is running.");
        }, "Second Thread");
        firstThread.setPriority(Thread.MIN_PRIORITY);
        secondThread.setPriority(Thread.MAX_PRIORITY);
        firstThread.start();
        secondThread.start();
        System.out.println(firstThread.getName() + " priority: " + firstThread.getPriority());
        System.out.println(secondThread.getName() + " priority: " + secondThread.getPriority());}
}
