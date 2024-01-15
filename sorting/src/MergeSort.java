import java.util.ArrayList;

public class MergeSort {

    static int[] divide(int[] array) {
        int length = array.length;
        if (length == 1)
            return array;

        int midPoint = length / 2;
        int[] left = new int[midPoint];
        System.arraycopy(array, 0, left, 0, midPoint);
        int[] right = new int[length - midPoint];
        System.arraycopy(array, midPoint, right, 0, length - midPoint);

        left = divide(left);
        right = divide(right);

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        ArrayList<Integer> array = new ArrayList<>();
        int i, j;
        i = j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) array.add(left[i++]);
            else array.add(right[j++]);
        }

        while (i < left.length) {
            array.add(left[i++]);
        }
        while (j < right.length) {
            array.add(right[j++]);
        }

        return array.stream().mapToInt(Integer::intValue).toArray();
    }

    static int[] sort(int[] array) {
        return divide(array);
    }
}
