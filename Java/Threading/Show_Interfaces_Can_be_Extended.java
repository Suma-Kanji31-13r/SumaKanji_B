package Threading;
import java.util.Scanner;
interface ParentInterface1 {
    void method1();
}

// Second parent interface
interface ParentInterface2 {
    void method2();
}

// Child interface that extends both ParentInterface1 and ParentInterface2
interface ChildInterface extends ParentInterface1, ParentInterface2 {
    void childMethod();
}

// Class that implements the child interface
class ImplementingClass implements ChildInterface {
    @Override
    public void method1() {
        System.out.println("Implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation of method2");
    }

    @Override
    public void childMethod() {
        System.out.println("Implementation of childMethod");
    }
}
public class Show_Interfaces_Can_be_Extended {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImplementingClass obj = new ImplementingClass();

        System.out.println("Enter 1 to call method1, 2 to call method2, or any other number to call childMethod:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                obj.method1();
                break;
            case 2:
                obj.method2();
                break;
            default:
                obj.childMethod();
                break;
        }
    }
}
