public class FibonacciSearch {
    static int fibonacciSearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        int fibMMinus2 = 0;
        int fibMMinus1 = 1;
        int fibM = fibMMinus1 + fibMMinus2;

        while (fibM < right - left + 1) { // creating the fibonacci numbers
            fibMMinus2 = fibMMinus1;
            fibMMinus1 = fibM;
            fibM = fibMMinus1 + fibMMinus2;
        }

        int offset = -1;

        while (fibM > 1) {
            int i = Math.min(offset + fibMMinus2, right - 1);

            if (array[i] < target) {
                fibM = fibMMinus1;
                fibMMinus1 = fibMMinus2;
                fibMMinus2 = fibM - fibMMinus1;
                offset = i;
            } else if (array[i] > target) {
                fibM = fibMMinus2;
                fibMMinus1 = fibMMinus1 - fibMMinus2;
                fibMMinus2 = fibM - fibMMinus1;
            } else {
                return i;
            }
        }

        if (fibMMinus1 == 1 && array[offset + 1] == target) {
            return offset + 1;
        }

        return -1;
    }

    static int search(int[] array, int n) {
        return fibonacciSearch(array, n);
    }

}
