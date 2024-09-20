package Exception_Handling;
import java.util.*;
class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message); } }
public class Library_Management_System_where_user_want_to_find_book {
    private static String[] books = {"The Alchemist", "The Da Vinci Code", "Harry Potter", "Moby Dick", "Pride and Prejudice"};
    public static void findBook(String bookName) throws BookNotFoundException {
        for (String book : books) {
            if (book.equalsIgnoreCase(bookName)) {
                System.out.println("Book found: " + book);
                return; } }
        throw new BookNotFoundException("BookNotFoundException: The book '" + bookName + "' is not found in our library."); }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the book you are searching for:");
        String bookName = scanner.nextLine();
        try {
            findBook(bookName);
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage()); }
        scanner.close(); }
}
