package Interface;
import java.util.*;
abstract class AbstractProduct {
    protected String productId;
    protected String name;
    protected String description;
    public AbstractProduct(String productId, String name, String description) {
        this.productId = productId;
        this.name = name;
        this.description = description; } }
class Book extends AbstractProduct {
    private String isbn;
    private String author;
    private String title;
    public Book(String productId, String name, String description,
                String isbn, String author, String title) {
        super(productId, name, description);
        this.isbn = isbn;
        this.author = author;
        this.title = title; }
    public void displayBookDetails() {
        System.out.println("Book Details:");
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author);
        System.out.println("Title: " + title); } }
class CompactDisc extends AbstractProduct {
    private int artistId;
    private int titleId;
    public CompactDisc(String productId, String name, String description,
                       int artistId, int titleId) {
        super(productId, name, description);
        this.artistId = artistId;
        this.titleId = titleId; } }
public class Diagram_AbstractProduct_is_only_abstract_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        String productId = scanner.nextLine();
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter product description: ");
        String productDescription = scanner.nextLine();
        Book book = new Book(productId, productName, productDescription,
                "isbn", "author", "title");
        book.displayBookDetails();
        CompactDisc cd = new CompactDisc(productId, productName,
                productDescription, 1, 2);
        scanner.close(); }
}
