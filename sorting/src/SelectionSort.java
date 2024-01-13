public class SelectionSort {
    static int[] sort(int[] array) {

        int k = 0, minIndex = 1, n = array.length, i, temp;

        while (k < n) {
            i = k;
            while (i < n) {
                if (array[i] < array[minIndex]) minIndex = i;
                ++i;
            }
            temp = array[k];
            array[k] = array[minIndex];
            array[minIndex] = temp;
            minIndex = ++k;
        }

        return array;
    }
}
