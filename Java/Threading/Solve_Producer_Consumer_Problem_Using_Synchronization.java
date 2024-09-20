package Threading;
import java.util.*;
public class Solve_Producer_Consumer_Problem_Using_Synchronization {
    private static Object lock = new Object();
    private static LinkedList<Integer> buffer = new LinkedList<>();
    private static int MAX_SIZE = 5;
    static class Producer implements Runnable {
        public void run() {
            int value = 0;
            while (true) {
                synchronized (lock) {
                    while (buffer.size() == MAX_SIZE) {
                        try {
                            System.out.println("Buffer is full, Producer is waiting...");
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace(); } }
                    System.out.println("Producing value : " + value);
                    buffer.add(value++);
                    lock.notifyAll(); }} } }
    static class Consumer implements Runnable {
        public void run() {
            while (true) {
                synchronized (lock) {
                    while (buffer.isEmpty()) {
                        try {
                            System.out.println("Buffer is empty, Consumer is waiting...");
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace(); } }
                    int value = buffer.removeFirst();
                    System.out.println("Consuming value : " + value);
                    lock.notifyAll(); } } } }
    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());
        producerThread.start();
        consumerThread.start(); }
}
