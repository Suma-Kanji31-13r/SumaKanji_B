package Interface;
import java.util.*;
interface Player {
    void play(); }
class Child implements Player {
    public void play() {
        System.out.println("Child is playing with toys."); } }
class Musician implements Player {
    public void play() {
        System.out.println("Musician is playing an instrument."); } }
class Actor implements Player {
    public void play() {
        System.out.println("Actor is playing a role in a movie."); } }
public class UsePlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a player to demonstrate:\n1. Child\n2. Musician\n3. Actor");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();
        Player player;
        switch (choice) {
            case 1:
                player = new Child();
                break;
            case 2:
                player = new Musician();
                break;
            case 3:
                player = new Actor();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                return; }
        player.play(); }
}
