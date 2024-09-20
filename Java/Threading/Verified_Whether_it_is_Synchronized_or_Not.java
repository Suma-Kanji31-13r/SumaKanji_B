package Threading;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;
public class Verified_Whether_it_is_Synchronized_or_Not {
    public synchronized void synchronizedMethod() {
        System.out.println("This is a synchronized method."); }
    // A non-synchronized method
    public void nonSynchronizedMethod() {
        System.out.println("This is NOT a synchronized method."); }
    public static void main(String[] args) {
        Method[] methods = Verified_Whether_it_is_Synchronized_or_Not.class.getDeclaredMethods();
        for (Method method : methods) {
// Check if the method is synchronized
            if (Modifier.isSynchronized(method.getModifiers())) {
                System.out.println(method.getName() + " is synchronized.");
            } else {
                System.out.println(method.getName() + " is NOT synchronized."); }} }
}
