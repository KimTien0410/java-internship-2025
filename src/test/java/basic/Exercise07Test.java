package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise07Test {

    @Test
    public void testToBinaryReverse() {
        final Exercise07 ex = new Exercise07();
        assert ex.toBinary(0).equals("0");
        assert ex.toBinary(5).equals("101");
        assert ex.toBinary(10).equals("1010");
        assert ex.toBinary(255).equals("11111111");
        assertEquals(255, ex.toDecimalReverse(255));
        assertEquals(5, ex.toDecimalReverse(5));
        assertEquals(29, ex.toDecimalReverse(23));
        assertEquals(0, ex.toDecimalReverse(0));
        assertEquals(5, ex.toDecimalReverse(10));
    }
}
