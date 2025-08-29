package basic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise05Test {
    final Exercise05 exercise05 = new Exercise05();
    @Test
    void shouldFactorial_OK() {
        assertEquals(120, exercise05.factorial(5));
        assertEquals(24, exercise05.factorial(4));
        assertEquals(6, exercise05.factorial(3));
        assertEquals(2, exercise05.factorial(2));
        assertEquals(1, exercise05.factorial(1));
        assertEquals(1, exercise05.factorial(0));
    }

    @Test
    void shouldFactorial_Throws_Exception() {
        assertThrows(IllegalArgumentException.class, (()-> exercise05.factorial(-1)), "Number must be non-negative");
        assertThrows(IllegalArgumentException.class, (()-> exercise05.factorial(-6)), "Number must be non-negative");
        assertThrows(IllegalArgumentException.class, (()-> exercise05.factorial(-5)), "Number must be non-negative");
    }
}
