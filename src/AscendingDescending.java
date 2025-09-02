import java.util.Arrays;
import java.util.Collections;

public class AscendingDescending {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 9, 1, 7};

        System.out.println("=== Data Asli ===");
        printArray(numbers);

        // Ascending (kecil -> besar)
        System.out.println("\n=== Ascending (kecil ke besar ===");
        Arrays.sort(numbers);
        printArray(numbers);

        // Descending (besar -> kecil)
        System.out.println("\n=== Descending (besar ke kecil) ===");
        Arrays.sort(numbers, Collections.reverseOrder());
        printArray(numbers);
    }
    private static void printArray(Integer[] arr) {
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}