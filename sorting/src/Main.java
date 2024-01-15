import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i, length = 25, n;
        Random random = new Random();
        int[] unsortedArray = new int[length];

        for (i = 0; i < length; ++i) {
            n = random.nextInt(100); // nums from 0 to 99
            unsortedArray[i] = n;
        }
        System.out.println("Unsorted: " + Arrays.toString(unsortedArray));

        /*
         * Implemented sorting algorithms:
         * BubbleSort
         * InsertionSort
         * SelectionSort
         * MergeSort
         */
        int[] sorted = QuickSort.sort(new int[]{3, 7, 8, 5, 2, 1, 9, 5, 4});
        System.out.println("Sorted: " + Arrays.toString(sorted));

    }
}