package Inheritance;

class Parent {
    static void display() {
        System.out.println("This is parent class.");
    }
}
class Child extends Parent {
    static void display() {
        System.out.println("This is child class.");
    }
}
public class method_hiding {
    public static void main(String[] args) {
        Parent.display();
        Child.display();}
}