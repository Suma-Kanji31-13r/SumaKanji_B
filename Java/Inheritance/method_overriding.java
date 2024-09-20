package Inheritance;
import java.util.*;
public class method_overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create an Animal object
        myAnimal.sound();
        Dog myDog = new Dog(); // Create a Dog object
        myDog.sound();
        Animal myNewDog = new Dog();
        myNewDog.sound(); }
}
class Animal {
    public void sound() {
        System.out.println("The animal makes a sound"); } }
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks"); } }
