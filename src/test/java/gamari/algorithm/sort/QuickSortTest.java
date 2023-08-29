package gamari.algorithm.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class QuickSortTest {

    @Test
    public void test_sort() {
        int[] array = { 9, 7, 5, 1, 6 };
        int[] expected = { 1, 5, 6, 7, 9 };

        QuickSort sorter = new QuickSort();
        sorter.sort(array);

        assertArrayEquals(expected, array,
                () -> "Expected: " + Arrays.toString(expected) + " but was: " + Arrays.toString(array));
    }
}
