package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise06Test {
    @Test
    void shouldReadMonth_OK() {
        final Exercise06 exercise06 = new Exercise06();
        assertEquals("January", exercise06.readMonth(1));
        assertEquals("February", exercise06.readMonth(2));
        assertEquals("March", exercise06.readMonth(3));
        assertEquals("April", exercise06.readMonth(4));
        assertEquals("May", exercise06.readMonth(5));
        assertEquals("June", exercise06.readMonth(6));
        assertEquals("July", exercise06.readMonth(7));
        assertEquals("August", exercise06.readMonth(8));
        assertEquals("September", exercise06.readMonth(9));
        assertEquals("October", exercise06.readMonth(10));
        assertEquals("November", exercise06.readMonth(11));
        assertEquals("December", exercise06.readMonth(12));
        assertEquals("Invalid month", exercise06.readMonth(0));
    }
}
