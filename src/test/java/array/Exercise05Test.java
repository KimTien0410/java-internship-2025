package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise05Test {
    @Test
    void shouldSearchX_OK() {
        final Exercise05 exercise05 = new Exercise05();
        assertEquals(4, exercise05.searchX(new int[]{1, 2, 3, 5}));
        assertEquals(1, exercise05.searchX(new int[]{2, 3, 4, 5}));
        assertEquals(5, exercise05.searchX(new int[]{1, 2, 3, 4}));
        assertEquals(3, exercise05.searchX(new int[]{1, 2, 4, 5}));
        assertEquals(2, exercise05.searchX(new int[]{1, 3, 4, 5}));
    }
}
