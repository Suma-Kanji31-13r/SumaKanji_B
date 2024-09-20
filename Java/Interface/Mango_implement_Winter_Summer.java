package Interface;
import java.util.*;
interface Mango {
    void describeMango();}
class Winter implements Mango {
    public void describeMango() {
        System.out.println("Winter Mango: Rich in taste, less fibrous."); } }
class Summer implements Mango {
    public void describeMango() {
        System.out.println("Summer Mango: Juicy, sweet, and very fibrous."); } }
public class Mango_implement_Winter_Summer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the season (Winter/Summer) to get mango details:");
        String season = scanner.nextLine().trim().toLowerCase();
        Mango mango;
        if ("winter".equals(season)) {
            mango = new Winter();
        } else if ("summer".equals(season)) {
            mango = new Summer();
        } else {
            System.out.println("Invalid season. Please enter either 'Winter' or 'Summer'.");
            return; }
        mango.describeMango(); }
}
