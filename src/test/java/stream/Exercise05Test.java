package stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise05Test {
    @Test
    public void shouldSumMaxDigitNumber_OK() {
        final Exercise05 exercise05 = new Exercise05();
        assertEquals(333, exercise05.sumMaxDigitNumber(new int[]{1, 22, 333, 44, 5}));
        assertEquals(7890, exercise05.sumMaxDigitNumber(new int[]{123, 45, 6, 7890}));
        assertEquals(6912, exercise05.sumMaxDigitNumber(new int[]{7, 89, 1234, 5678}));
        assertEquals(6, exercise05.sumMaxDigitNumber(new int[]{0, 1, 2, 3}));
        assertEquals(999, exercise05.sumMaxDigitNumber(new int[]{9, 99, 999}));
        assertEquals(100, exercise05.sumMaxDigitNumber(new int[]{10, 20, 30, 40}));
    }
}
