package Array_constructor_matrix;
import java.util.*;
public class print_every_alternate_number_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Every alternate element of the array:");
        for (int i = 0; i < size; i += 2) {
            System.out.print(array[i] + " "); } }
}
