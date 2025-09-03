package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exercise08Test {
    final Exercise08 exercise08 = new Exercise08();
    @Test
    void testToRomanNumerals() {
        assertEquals("I", exercise08.toRomanNumerals(1));
        assertEquals("II", exercise08.toRomanNumerals(2));
        assertEquals("III", exercise08.toRomanNumerals(3));
        assertEquals("IV", exercise08.toRomanNumerals(4));
        assertEquals("V", exercise08.toRomanNumerals(5));
        assertEquals("VI", exercise08.toRomanNumerals(6));
        assertEquals("VII", exercise08.toRomanNumerals(7));
        assertEquals("VIII", exercise08.toRomanNumerals(8));
        assertEquals("IX", exercise08.toRomanNumerals(9));
        assertEquals("X", exercise08.toRomanNumerals(10));
        assertEquals("XLII", exercise08.toRomanNumerals(42));
        assertEquals("LXXV", exercise08.toRomanNumerals(75));
        assertEquals("C", exercise08.toRomanNumerals(100));
        assertEquals("CD", exercise08.toRomanNumerals(400));
        assertEquals("D", exercise08.toRomanNumerals(500));
        assertEquals("DCCLXXXIX", exercise08.toRomanNumerals(789));
        assertEquals("MCMXCIX", exercise08.toRomanNumerals(1999));
    }
    @Test
    void testToRomanNumerals_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> exercise08.toRomanNumerals(-1));
        assertThrows(IllegalArgumentException.class, () -> exercise08.toRomanNumerals(0));
        assertThrows(IllegalArgumentException.class, () -> exercise08.toRomanNumerals(4000));
        assertThrows(IllegalArgumentException.class, () -> exercise08.toRomanNumerals(-10));
    }
}
