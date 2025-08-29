package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise02Test {
    @Test
    void shouldSearchBinary_OK() {
        final Exercise02 exercise02 = new Exercise02();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(0, exercise02.searchBinary(array, 1));
        assertEquals(4,exercise02.searchBinary(array, 5));
        assertEquals( 9, exercise02.searchBinary(array, 10));
        assertEquals(-1, exercise02.searchBinary(array, 11));
        assertEquals(-1, exercise02.searchBinary(array, -1));
    }
}
