package Array_constructor_matrix;
import java.util.*;
public class Stack_using_array {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    Stack_using_array(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Add elements to the stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // Remove element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return arr[top--];
    }

    // Utility method to return the size of the stack
    public int size() {
        return top + 1;
    }

    // Utility method to check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // Utility method to check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }

    // Utility method to see the top element of the stack
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.exit(1);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = scanner.nextInt();
        Stack_using_array stack = new Stack_using_array(size);

        boolean quit = false;
        while (!quit) {
            System.out.println("\nChoose an action: (1) Push (2) Pop (3) Peek (4) Quit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: // Push
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2: // Pop
                    System.out.println("Popped: " + stack.pop());
                    break;
                case 3: // Peek
                    System.out.println("Top element: " + stack.peek());
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
