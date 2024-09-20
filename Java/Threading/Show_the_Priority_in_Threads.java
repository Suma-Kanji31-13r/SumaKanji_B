package Threading;

public class Show_the_Priority_in_Threads extends Thread {
    public void run() {
        System.out.println("Inside the run() method"); }
    public static void main(String[] args) {
        Show_the_Priority_in_Threads th1 = new Show_the_Priority_in_Threads();
        Show_the_Priority_in_Threads th2 = new Show_the_Priority_in_Threads();
        Show_the_Priority_in_Threads th3 = new Show_the_Priority_in_Threads();
// Default priority is 5 (NORM_PRIORITY)
        System.out.println("Priority of thread th1 is: " + th1.getPriority());
        System.out.println("Priority of thread th2 is: " + th2.getPriority());
// Set priorities explicitly
        th1.setPriority(6); // Higher priority
        th2.setPriority(3); // Lower priority
        th3.setPriority(9); // Highest priority
        System.out.println("Priority of thread th1 is: " + th1.getPriority());
        System.out.println("Priority of thread th2 is: " + th2.getPriority());
        System.out.println("Priority of thread th3 is: " + th3.getPriority());
// Display main thread's priority
        System.out.println("Currently executing thread: " + Thread.currentThread().getName());
        System.out.println("Priority of the main thread is: " + Thread.currentThread().getPriority());}
}
