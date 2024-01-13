public class InsertionSort {

    static int[] sort(int[] array) {

        int k = 1, i, temp;

        while (k < array.length) {
            i = k;
            while (i >= 1) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
                --i;
            }
            ++k;
        }
        return array;
    }
}
