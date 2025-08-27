package stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise02Test {
    @Test
    void shouldFindNumberNotInArray_OK() {
        final Exercise02 exercise02 = new Exercise02();
        assertEquals(4, exercise02.findNumberNotInArray(new int[]{1, 2, 3, 5}));
        assertEquals(1, exercise02.findNumberNotInArray(new int[]{2, 3, 4, 5}));
        assertEquals(5, exercise02.findNumberNotInArray(new int[]{1, 2, 3, 4}));
        assertEquals(3, exercise02.findNumberNotInArray(new int[]{1, 2, 4, 5}));
        assertEquals(6, exercise02.findNumberNotInArray(new int[]{1, 2, 3, 4, 5}));
    }
}
