package Threading;
import java.util.*;
class A {
    public synchronized void last() {
        System.out.println("Inside A, last() method");
    }
    public synchronized void d1(B b) {
        System.out.println("Thread1 starts execution of d1() method");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread1 trying to call B's last() method");
        b.last(); }}
class B {
    public synchronized void last() {
        System.out.println("Inside B, last() method"); }
    public synchronized void d2(A a) {
        System.out.println("Thread2 starts execution of d2() method");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e); }
        System.out.println("Thread2 trying to call A's last() method");
        a.last(); }}
public class Solve_Deadlock_Using_Thread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Thread thread1 = new Thread(() -> {
            synchronized (a) {
                a.d1(b); } });
        Thread thread2 = new Thread(() -> {
            synchronized (a) {
                b.d2(a); } });
        thread1.start();
        thread2.start(); }
}
