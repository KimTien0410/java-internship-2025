package stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise01Test {
    @Test
    void shouldDifferentOddsAndEvens_OK() {
        final Exercise01 exercise01 = new Exercise01();
        assertEquals(-2, exercise01.differentOddsAndEvens(new int[]{1, 2, 3}));
        assertEquals(-3, exercise01.differentOddsAndEvens(new int[]{1, 1, 1}));
        assertEquals(6, exercise01.differentOddsAndEvens(new int[]{2, 2, 2}));
        assertEquals(1, exercise01.differentOddsAndEvens(new int[]{1, 2}));
        assertEquals(1, exercise01.differentOddsAndEvens(new int[]{2, 1}));
        assertEquals(0, exercise01.differentOddsAndEvens(new int[]{}));
    }
}
