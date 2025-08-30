package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise08Test {

    @Test
    void testToRomanNumerals() {
        final Exercise08 exercise08 = new Exercise08();
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
        final Exercise08 exercise08 = new Exercise08();
        try {
            exercise08.toRomanNumerals(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Number out of range (1-3999)", e.getMessage());
        }
        try {
            exercise08.toRomanNumerals(4000);
        } catch (IllegalArgumentException e) {
            assertEquals("Number out of range (1-3999)", e.getMessage());
        }
        try {
            exercise08.toRomanNumerals(-5);
        } catch (IllegalArgumentException e) {
            assertEquals("Number out of range (1-3999)", e.getMessage());
        }
    }
}
