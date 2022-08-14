package dsa.alg;

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

}
