package Array_constructor_matrix;
import java.util.*;
public class merge_two_float_arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the first array
        System.out.print("Enter the size of the first array: ");
        int sizeFirst = scanner.nextInt();
        float[] firstArray = new float[sizeFirst];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < sizeFirst; i++) {
            firstArray[i] = scanner.nextFloat();
        }

        // Prompt for the second array
        System.out.print("Enter the size of the second array: ");
        int sizeSecond = scanner.nextInt();
        float[] secondArray = new float[sizeSecond];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < sizeSecond; i++) {
            secondArray[i] = scanner.nextFloat();
        }

        // Merge the arrays
        float[] mergedArray = mergeArrays(firstArray, secondArray);

        // Print the merged array
        System.out.println("Merged Array:");
        for (float element : mergedArray) {
            System.out.print(element + " ");
        }
    }

    private static float[] mergeArrays(float[] firstArray, float[] secondArray) {
        float[] mergedArray = new float[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, mergedArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, mergedArray, firstArray.length, secondArray.length);
        return mergedArray;
    }
}
