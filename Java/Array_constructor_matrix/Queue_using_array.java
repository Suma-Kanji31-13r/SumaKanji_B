package Array_constructor_matrix;
import java.util.*;
public class Queue_using_array {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Constructor to initialize the queue
    Queue_using_array(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Add an element to the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            System.exit(1);
        }
        System.out.println("Inserting " + item);
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    // Remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            System.exit(1);
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        count--;
        return item;
    }

    // Peek the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            System.exit(1);
        }
        return arr[front];
    }

    // Utility method to check if the queue is empty
    public boolean isEmpty() {
        return (count == 0);
    }

    // Utility method to check if the queue is full
    public boolean isFull() {
        return (count == capacity);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        int size = scanner.nextInt();
        Queue_using_array queue = new Queue_using_array(size);

        boolean quit = false;
        while (!quit) {
            System.out.println("\nChoose an action: (1) Enqueue (2) Dequeue (3) Peek (4) Quit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: // Enqueue
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2: // Dequeue
                    System.out.println("Dequeued: " + queue.dequeue());
                    break;
                case 3: // Peek
                    System.out.println("Front element: " + queue.peek());
                    break;
                case 4: // Quit
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
