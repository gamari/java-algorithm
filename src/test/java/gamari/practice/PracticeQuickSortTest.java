package gamari.practice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import gamari.algorithm.sort.QuickSort;
import gamari.practice.sort.PracticeQuickSort;

public class PracticeQuickSortTest {
    @Test
    void testSort() {
        int[] array = { 9, 7, 5, 1, 6 };
        int[] expected = { 1, 5, 6, 7, 9 };

        PracticeQuickSort sorter = new PracticeQuickSort();
        sorter.sort(array);

        assertArrayEquals(expected, array,
                () -> "Expected: " + Arrays.toString(expected) + " but was: " + Arrays.toString(array));
    }

    @Test
    void testZeroArray() {
        int[] array = {};
        int[] expected = {};

        PracticeQuickSort sorter = new PracticeQuickSort();
        sorter.sort(array);

        assertArrayEquals(expected, array,
                () -> "Expected: " + Arrays.toString(expected) + " but was: " + Arrays.toString(array));
    }

    @Test
    void testOneArray() {
        int[] array = { 1 };
        int[] expected = { 1 };

        PracticeQuickSort sorter = new PracticeQuickSort();
        sorter.sort(array);

        assertArrayEquals(expected, array,
                () -> "Expected: " + Arrays.toString(expected) + " but was: " + Arrays.toString(array));
    }

    @Test
    void testTwoArray() {
        int[] array = { 2, 1 };
        int[] expected = { 1, 2 };

        PracticeQuickSort sorter = new PracticeQuickSort();
        sorter.sort(array);

        assertArrayEquals(expected, array,
                () -> "Expected: " + Arrays.toString(expected) + " but was: " + Arrays.toString(array));
    }
}
