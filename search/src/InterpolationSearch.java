/*
 * Interpolation search is an improvement over binary search. Interpolation search checks at different positions
 * based on the value of the element being searched using the following formula:
 * pos = left + (((double) (right-left) / (array[right]-array[left])) * (target-array[left]))
 * The only difference is also the way the algorithm chooses the spot, at which to split the array.
 */


public class InterpolationSearch {
    static int interpolationSearch(int[] array, int target, int left, int right) {
        if (left <= right) {
            int pos = left + (int) (((double) (right - left) / (array[right] - array[left])) * (target - array[left]));
            if (target == array[pos]) return pos;
            else if (target > array[pos]) return interpolationSearch(array, target, pos + 1, right);
            else if (target < array[pos]) return interpolationSearch(array, target, left, pos - 1);
        }
        return -1; // Element not found
    }

    static int search(int[] array, int n) {

        return interpolationSearch(array, n, 0, array.length - 1);
    }

}
