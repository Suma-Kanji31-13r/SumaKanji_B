package Array_constructor_matrix;
import java.util.*;
public class two_one_dimensional_arrays_A_B_merge_single_sorted_array_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter the size of the first sorted array: ");
        int sizeA = scanner.nextInt();
        int[] arrayA = new int[sizeA];
        System.out.println("Enter the elements of the first sorted array:");
        for (int i = 0; i < sizeA; i++) {
            arrayA[i] = scanner.nextInt();
        }

        // Input for the second array
        System.out.print("Enter the size of the second sorted array: ");
        int sizeB = scanner.nextInt();
        int[] arrayB = new int[sizeB];
        System.out.println("Enter the elements of the second sorted array:");
        for (int i = 0; i < sizeB; i++) {
            arrayB[i] = scanner.nextInt();
        }

        // Merge the sorted arrays
        int[] arrayC = mergeSortedArrays(arrayA, arrayB);

        // Display the merged sorted array
        System.out.println("Merged Sorted Array:");
        for (int value : arrayC) {
            System.out.print(value + " ");
        }
    }

    private static int[] mergeSortedArrays(int[] arrayA, int[] arrayB) {
        int[] mergedArray = new int[arrayA.length + arrayB.length];
        int i = 0, j = 0, k = 0;

        // Merge arrays till one ends
        while (i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] < arrayB[j]) {
                mergedArray[k++] = arrayA[i++];
            } else {
                mergedArray[k++] = arrayB[j++];
            }
        }

        // Copy remaining elements from arrayA, if any
        while (i < arrayA.length) {
            mergedArray[k++] = arrayA[i++];
        }

        // Copy remaining elements from arrayB, if any
        while (j < arrayB.length) {
            mergedArray[k++] = arrayB[j++];
        }

        return mergedArray;
    }
}
