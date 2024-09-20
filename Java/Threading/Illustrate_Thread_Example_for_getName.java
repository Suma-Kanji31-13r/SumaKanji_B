package Threading;
import java.util.*;
class RThread extends Thread {
    @Override
    public void run() {
        System.out.println("Inside run method, thread name is: " + this.getName());
    }
}
public class Illustrate_Thread_Example_for_getName {
    public static void main(String[] args) {
        RThread thread = new RThread();
        System.out.println("Default thread name: " + thread.getName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new name for the thread: ");
        String newName = scanner.nextLine();

        thread.setName(newName);
        System.out.println("New thread name: " + thread.getName());

        thread.start();
    }
}
