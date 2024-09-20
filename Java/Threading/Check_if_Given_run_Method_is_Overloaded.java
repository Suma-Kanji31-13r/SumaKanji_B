package Threading;
import java.util.*;
import java.lang.reflect.Method;
class JThread extends Thread {
    public void run() {
        System.out.println("Running with no arguments");
    }

    // Example of an overloaded run method
    public void run(String arg) {
        System.out.println("Running with a String argument: " + arg);
    }
}
public class Check_if_Given_run_Method_is_Overloaded {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Checking for overloaded 'run' methods in MyThread class.");

        // Use reflection to get all methods of MyThread
        Method[] methods = JThread.class.getDeclaredMethods();

        for (Method method : methods) {
            // Check if the method is named 'run'
            if (method.getName().equals("run")) {
                Class<?>[] parameterTypes = method.getParameterTypes();

                // Print out parameter types, if any
                if (parameterTypes.length > 0) {
                    System.out.print("Found an overloaded 'run' method with parameters: ");
                    for (Class<?> paramType : parameterTypes) {
                        System.out.print(paramType.getName() + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Found the standard 'run' method with no parameters.");
                }
            }
        }
    }
}
