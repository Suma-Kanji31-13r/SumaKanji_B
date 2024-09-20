package Threading;
class EmptyThread extends Thread {
    // Not overriding the run() method.
}
public class Check_Whether_Define_Without_Defining_run {
    public static void main(String[] args) {
        EmptyThread thread = new EmptyThread();
        thread.start(); // Starting the thread.

        // Check if the thread has started
        if (thread.isAlive()) {
            System.out.println("The thread has started, but it's not doing anything because run() is not overridden.");
        } else {
            System.out.println("The thread has not started or it has already completed its execution.");
        }

        // Waiting for the thread to finish, if it had any tasks to perform.
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After join, checking thread state.");
        if (!thread.isAlive()) {
            System.out.println("The thread has completed.");
        } else {
            System.out.println("The thread is still running.");
        }
    }
}
