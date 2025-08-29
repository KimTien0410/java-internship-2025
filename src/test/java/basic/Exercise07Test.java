package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise07Test {

    @Test
    public void testToBinaryReverse() {
        final Exercise07 ex = new Exercise07();
        assertEquals("0", ex.toBinary(0));
        assertEquals("101", ex.toBinary(5));
        assertEquals("1010", ex.toBinary(10));
        assertEquals("11111111", ex.toBinary(255));
        assertEquals(255, ex.toDecimalReverse(255));
        assertEquals(5, ex.toDecimalReverse(5));
        assertEquals(29, ex.toDecimalReverse(23));
        assertEquals(0, ex.toDecimalReverse(0));
        assertEquals(5, ex.toDecimalReverse(10));
    }
}
