package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exercise03Test {
    @Test
    void shouldReverseArray_OK() {
        final Exercise03 exercise03 = new Exercise03();
        int[] array1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 4, 3, 2, 1};
        assertArrayEquals(expected1, exercise03.reverseArray(array1));

        int[] array2 = {10, 20, 30};
        int[] expected2 = {30, 20, 10};
        assertArrayEquals(expected2, exercise03.reverseArray(array2));

        int[] array3 = {7};
        int[] expected3 = {7};
        assertArrayEquals(expected3, exercise03.reverseArray(array3));

        int[] array4 = {};
        int[] expected4 = {};
        assertArrayEquals(expected4, exercise03.reverseArray(array4));
    }
}
