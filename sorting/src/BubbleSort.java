public class BubbleSort {
    static int[] sort(int[] array) {
        int n = array.length;
        int i, temp;
        boolean swapped = false;
        while (!swapped) {
            swapped = true;
            for (i = 0; i < n - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    swapped = false;
                }
            }

        }
        return array;
    }
}
