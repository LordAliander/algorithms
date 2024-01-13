public class BinarySearch {
    static int search(int[] array, int n) {
        return binarySearch(array, n, 0, array.length - 1);
    }

    static int binarySearch(int[] array, int target, int left, int right) {
        if (left <= right) {
            int midPoint = left + (right - left) / 2;

            if (array[midPoint] == target) {
                return midPoint; // Element found
            } else if (array[midPoint] > target) {
                // Recursive call to search using the left half of array
                return binarySearch(array, target, left, midPoint - 1);
            } else {
                // Recursive call to search using the right half of array
                return binarySearch(array, target, midPoint + 1, right);
            }
        }
        return -1; // Element not found
    }
}
