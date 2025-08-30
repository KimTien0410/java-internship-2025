package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exercise04Test {

    @Test
    void shouldMergeSortedArrays_OK() {
        final Exercise04 exercise04 = new Exercise04();
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, exercise04.mergeSortedArrays(array1, array2));

        array1 = new int[]{1, 2, 3};
        array2 = new int[]{4, 5, 6};
        expected = new int[]{1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, exercise04.mergeSortedArrays(array1, array2));

        array1 = new int[]{4, 5, 6};
        array2 = new int[]{1, 2, 3};
        expected = new int[]{1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, exercise04.mergeSortedArrays(array1, array2));

        array1 = new int[]{1, 3, 5};
        array2 = new int[]{};
        expected = new int[]{1, 3, 5};
        assertArrayEquals(expected, exercise04.mergeSortedArrays(array1, array2));

        array1 = new int[]{};
        array2 = new int[]{2, 4, 6};
        expected = new int[]{2, 4, 6};
        assertArrayEquals(expected, exercise04.mergeSortedArrays(array1, array2));

        array1 = new int[]{};
        array2 = new int[]{};
        expected = new int[]{};
        assertArrayEquals(expected, exercise04.mergeSortedArrays(array1, array2));
    }
}
