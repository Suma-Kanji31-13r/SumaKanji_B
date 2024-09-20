package Interface;
interface Animal {
    void makeSound(); }
class Dog implements Animal {
    public void makeSound() {
        System.out.println("The dog barks"); } }
class Cat implements Animal {
    public void makeSound() {
        System.out.println("The cat meows"); } }
public class use_of_interface {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound();
        myCat.makeSound();
        Animal[] animals = new Animal[]{new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.makeSound(); } }
}
