package Inheritance;
class Animal3 {
    void eat() {
        System.out.println("Animal is eating..."); } }
class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Dog is barking..."); } }
class Labrador3 extends Dog3 {
    void color() {
        System.out.println("Labrador is golden in color."); } }
public class multilevel_inheritance {
    public static void main(String[] args) {
        Labrador3 labrador = new Labrador3();
        labrador.eat(); // Inherited from Animal
        labrador.bark(); // Inherited from Dog
        labrador.color(); // Defined in Labrador class }
    }
}
