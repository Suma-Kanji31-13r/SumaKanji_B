package Array_constructor_matrix;
import java.util.*;
public class find_duplicate_elements_1D_array_and_find_frequency_occurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            frequencyMap.put(array[i], frequencyMap.getOrDefault(array[i], 0) + 1);
        }
        System.out.println("Duplicate elements and their frequencies:");
        boolean duplicatesFound = false;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
                duplicatesFound = true;
            }
        }
        if (!duplicatesFound) {
            System.out.println("No duplicate elements found."); } }
}
