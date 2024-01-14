public class TernarySearch {

    static int ternarySearch(int[] array, int n, int left, int right) {
        if (left <= right) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (n == array[mid1]) return mid1; // Element found
            else if (n == array[mid2]) return mid2;
            else if (n < array[mid1]) return ternarySearch(array, n, left, mid1 - 1);
            else if (n > array[mid2]) return ternarySearch(array, n, mid2 + 1, right);
            else return ternarySearch(array, n, mid1 + 1, mid2 - 1);
        }
        return -1; // Element not found
    }

    static int search(int[] array, int n) {
        return ternarySearch(array, n, 0, array.length - 1);
    }

}
