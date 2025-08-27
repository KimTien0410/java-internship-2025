package stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exercise04Test {
    @Test
    void shouldSortByAlphabeticalOrder_OK() {
        final Exercise04 exercise04 = new Exercise04();
        assertArrayEquals(new int[]{11, 18, 2, 3, 8}, exercise04.sortByAlphabeticalOrder(new int[]{3, 2, 11, 18, 8}));
        assertArrayEquals(new int[]{1, 10, 100, 12, 2}, exercise04.sortByAlphabeticalOrder(new int[]{2, 12, 100, 10, 1}));
        assertArrayEquals(new int[]{5, 50, 500, 51, 6}, exercise04.sortByAlphabeticalOrder(new int[]{6, 51, 500, 50, 5}));
        assertArrayEquals(new int[]{0, 1, 10, 100}, exercise04.sortByAlphabeticalOrder(new int[]{100, 10, 1, 0}));
    }
}
