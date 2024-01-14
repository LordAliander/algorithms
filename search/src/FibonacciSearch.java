
/*
 * 1. Find a fibonacci number >= length of array
 * 2. Find the two previous fibonacci numbers. One is the offset, the other one the index.
 * 3. Compare n to the element at index.
 *  3.1 If n == elem at index return index.
 *  3.2 If n < elem at index -> search left of index
 *  3.3 If n > elem at index -> search right of index
 * 4. If not found repeat until index >= 0
 */

import java.util.HashMap;

public class FibonacciSearch {
    /*
     * In this case the HashMap is used as a data structure analog to a dictionary in python.
     * If the program requests the same fibonacci number more than once, it can retrieve it
     * by accessing the value at the key, which was stored previously.
     */
    static HashMap<Integer, Integer> memo = new HashMap<>();

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) { // dynamic element
            return memo.get(n);
        }

        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {

        int[] array = {2, 5, 8, 10, 12, 15, 18, 20, 23, 25, 28, 30, 32, 35, 38,
                40, 43, 46, 48, 50, 53, 56, 58, 61, 64};
        int n = 40;


    }
}
