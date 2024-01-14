
public class TernarySearch {

    static int ternarySearch(int[] array, int n) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (n == array[mid1]) return mid1;
            else if (n == array[mid2]) return mid2;
            else if (n < array[mid1]) right = mid1 - 1;
            else if (n > array[mid2]) left = mid2 + 1;
            else {
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }
        return -1; // Element not found
    }

    static int search(int[] array, int n) {
        return ternarySearch(array, n);
    }

}
