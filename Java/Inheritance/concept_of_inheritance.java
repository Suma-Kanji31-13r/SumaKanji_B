package Inheritance;

public class concept_of_inheritance {
    public static void main(String[] args) {
        C1 obj1 = new C1();
        obj1.display();
        obj1.show(); } }
class P1 {
    void display() {
        System.out.println("This is parent class.");} }
class C1 extends P1 {
    void show() {
        System.out.println("This is child class.");
    }
}
