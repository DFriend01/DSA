package dsa.alg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Math;

public class Sorting {

    /**
     * Performs the selection sort algorithm to sort an array in ascending order in-place.
     * @param array The array to be sorted.
     * @param <T> A comparable type.
     */
    public static <T extends Comparable<T>> void selectionSort(T[] array) {
        for(int i = 0; i < array.length; i++) {

            // Search for minimum in array starting from i to end
            int minIdx = i;
            for(int j = i+1; j < array.length; j++) {
                int currIdx = j;
                if(array[currIdx].compareTo(array[minIdx]) < 0) {
                    minIdx = currIdx;
                }
            }

            // Swap the minimum and the current position
            T temp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = temp;

        }
    }

    /**
     * Performs the insertion sort algorithm to sort an array in ascending order in-place.
     * @param array The array to be sorted.
     * @param <T> A comparable type.
     */
    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        for(int i = 1; i < array.length; i++) {

            // If array not in ascending order, perform swapping
            if(array[i].compareTo(array[i-1]) < 0) {

                // Swap while we are not at the beginning of array and previous value is larger
                int j = i;
                while((j > 0) && (array[j].compareTo(array[j-1]) < 0)) {
                    T temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    j--;
                }
            }
        }
    }

    /**
     * Performs the bubble sort algorithm to sort an array in ascending order.
     * @param array The array to be sorted.
     * @param <T> A comparable type.
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - (i+1); j++) {
                if(array[j].compareTo(array[j+1]) > 0) {
                    T temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * Performs the merge sort algorithm to sort an array in ascending order in-place.
     * @param array Array to be sorted
     * @param <T> A comparable type.
     */
    public static <T extends Comparable<T>> void mergeSort(T[] array) {
        // Base case: return array less than size of 2
        if(array.length <= 1) {
            return;
        }

        // Split array into left and right
        int length = array.length;
        int mid = length / 2;

        T[] left = Arrays.copyOfRange(array, 0, mid);
        T[] right = Arrays.copyOfRange(array, mid, length);

        // Sort left and right sides
        mergeSort(left);
        mergeSort(right);

        // Merge left and right arrays to get fully sorted array
        int l = 0;
        int r = 0;
        int i = 0;

        while((l < left.length) || (r < right.length)) {
            if(l == left.length) {
                array[i] = right[r];
                i++;
                r++;
            }
            else if(r == right.length) {
                array[i] = left[l];
                i++;
                l++;
            }
            else if(left[l].compareTo(right[r]) <= 0) {
                array[i] = left[l];
                i++;
                l++;
            }
            else {
                array[i] = right[r];
                i++;
                r++;
            }
        }
    }

    /**
     * Performs the radix sort algorithm to sort an array of long values in base 10
     * in ascending order.
     * @param array The array to be sorted.
     */
    public static void radixSort(Long[] array) {

        // Find the integer with the largest amount of digits
        long maxNumDigits = 0;
        for(long n : array) {
            maxNumDigits = Math.max(maxNumDigits, (long)Math.log10((double)n) + 1);
        }

        // Perform k passes where k is the max number of digits
        for(long i = 0; i < maxNumDigits; i++) {

            // Initialize hashmap for each digit
            HashMap<Long, ArrayList<Long>> nums = new HashMap<>();
            for(long d = 0; d < 10; d++) {
                nums.put(d, new ArrayList<>());
            }

            // Go through array and bucket numbers by kth digit
            for(long n : array) {

                // Extract the kth digit
                long n_copy = n;
                for(long k = 0; k < i; k++) {
                    n_copy /= 10;
                }
                long digit = n_copy % 10;

                // Add number into bucket based on digit
                nums.get(digit).add(n);
            }

            // Go through each bucket and add the numbers back to the array in order
            int idx = 0;
            for (long bucket = 0; bucket < 10; bucket++) {
                for(Long n : nums.get(bucket)) {
                    array[idx] = n;
                    idx++;
                }
            }
        }
    }

}
