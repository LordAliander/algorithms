public class LinearSearch {
    static int search(int[] array, int n) {
        // this will only return the first occurrence of n
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == n)
                return i;
        }
        return -1; // no element matching n has been found
    }
}
