package dsa.alg.test;

import dsa.alg.Sorting;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortingTest {

    private final Integer[] testArr1 = {};
    private final Integer[] testArr2 = {5,3,1,0,-1,-1,-2,-2,-5};
    private final Double[] testArr3 = {-1.0, 0.0, 2.0, -3.0, -4.0, 10.2, 10.1};
    private final Long[] testArr4 = {154L, 10L, 99L, 345L, 0L, 9L, 1L, 4L, 55L, 21L, 25L, 26L, 30L, 0L, 0L};

    private <T extends Comparable<T>> boolean checkArray(T[] array) {
        for(int i = 1; i < array.length; i++) {
            if(array[i-1].compareTo(array[i]) > 0){
                return false;
            }
        }
        return true;
    }

    @Test
    public void testSelectionSort1() {
        Integer[] array = Arrays.copyOf(testArr1, testArr1.length);
        Sorting.selectionSort(array);
        assertTrue(checkArray(array));
    }

    @Test
    public void testSelectionSort2() {
        Integer[] array = Arrays.copyOf(testArr2, testArr2.length);
        Sorting.selectionSort(array);
        assertTrue(checkArray(array));
    }

    @Test
    public void testSelectionSort3() {
        Double[] array = Arrays.copyOf(testArr3, testArr3.length);
        Sorting.selectionSort(array);
        assertTrue(checkArray(array));
    }

    @Test
    public void testInsertionSort1() {
        Integer[] array = Arrays.copyOf(testArr1, testArr1.length);
        Sorting.insertionSort(array);
        assertTrue(checkArray(array));
    }

    @Test
    public void testInsertionSort2() {
        Integer[] array = Arrays.copyOf(testArr2, testArr2.length);
        Sorting.insertionSort(array);
        assertTrue(checkArray(array));
    }

    @Test
    public void testInsertionSort3() {
        Double[] array = Arrays.copyOf(testArr3, testArr3.length);
        Sorting.insertionSort(array);
        assertTrue(checkArray(array));
    }

    @Test
    public void testBubbleSort1() {
        Integer[] array = Arrays.copyOf(testArr1, testArr1.length);
        Sorting.bubbleSort(array);
        assertTrue(checkArray(array));
    }

    @Test
    public void testBubbleSort2() {
        Integer[] array = Arrays.copyOf(testArr2, testArr2.length);
        Sorting.bubbleSort(array);
        assertTrue(checkArray(array));
    }

    @Test
    public void testBubbleSort3() {
        Double[] array = Arrays.copyOf(testArr3, testArr3.length);
        Sorting.bubbleSort(array);
        assertTrue(checkArray(array));
    }

    @Test
    public void testMergeSort1() {
        Integer[] array = Arrays.copyOf(testArr1, testArr1.length);
        Sorting.mergeSort(array);
        assertTrue(checkArray(array));
    }

    @Test
    public void testMergeSort2() {
        Integer[] array = Arrays.copyOf(testArr2, testArr2.length);
        Sorting.mergeSort(array);
        assertTrue(checkArray(array));
    }

    @Test
    public void testMergeSort3() {
        Double[] array = Arrays.copyOf(testArr3, testArr3.length);
        Sorting.mergeSort(array);
        assertTrue(checkArray(array));
    }

    @Test
    public void testRadixSort1() {
        Long[] array = Arrays.copyOf(testArr4, testArr4.length);
        Sorting.radixSort(array);
        assertTrue(checkArray(array));
    }

}
