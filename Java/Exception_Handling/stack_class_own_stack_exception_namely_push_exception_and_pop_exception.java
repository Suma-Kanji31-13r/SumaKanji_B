package Exception_Handling;
import java.util.*;
class PushException extends Exception {
    public PushException(String message) {
        super(message); }}
class PopException extends Exception {
    public PopException(String message) {
        super(message); }}
class Stack {
    private int[] elements;
    private int top;
    private int capacity;
    public Stack(int size) {
        elements = new int[size];
        capacity = size;
        top = -1; }
    public void push(int element) throws PushException {
        if (isFull()) {
            throw new PushException("Stack is full. Cannot push element."); }
        elements[++top] = element; }
    public int pop() throws PopException {
        if (isEmpty()) {
            throw new PopException("Stack is empty. Cannot pop element."); }
        return elements[top--]; }
    public boolean isEmpty() {
        return top == -1; }
    public boolean isFull() {
        return top == capacity - 1; } }
public class stack_class_own_stack_exception_namely_push_exception_and_pop_exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        Stack stack = new Stack(size);
        try {
            for (int i = 0; i < size + 1; i++) {
                System.out.println("Pushing: " + i);
                stack.push(i); }
        } catch (PushException e) {
            System.out.println(e.getMessage()); }
        try {
            for (int i = 0; i < size + 1; i++) {
                System.out.println("Popped: " + stack.pop()); }
        } catch (PopException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();} }
}
