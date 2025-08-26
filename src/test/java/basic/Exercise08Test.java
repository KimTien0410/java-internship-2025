package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise08Test {

    @Test
    void testBinaryToRomanNumerals() {
        final Exercise08 exercise08 = new Exercise08();
        assertEquals("I", exercise08.binaryToRomanNumerals("1"));
        assertEquals("II", exercise08.binaryToRomanNumerals("10"));
        assertEquals("III", exercise08.binaryToRomanNumerals("11"));
        assertEquals("IV", exercise08.binaryToRomanNumerals("100"));
        assertEquals("V", exercise08.binaryToRomanNumerals("101"));
        assertEquals("VI", exercise08.binaryToRomanNumerals("110"));
        assertEquals("VII", exercise08.binaryToRomanNumerals("111"));
        assertEquals("VIII", exercise08.binaryToRomanNumerals("1000"));
        assertEquals("IX", exercise08.binaryToRomanNumerals("1001"));
        assertEquals("X", exercise08.binaryToRomanNumerals("1010"));
        assertEquals("XLII", exercise08.binaryToRomanNumerals("101010")); // 42
        assertEquals("LXXV", exercise08.binaryToRomanNumerals("1001011")); // 75
        assertEquals("C", exercise08.binaryToRomanNumerals("1100100")); // 100
        assertEquals("CD", exercise08.binaryToRomanNumerals("110010000")); // 400
        assertEquals("D", exercise08.binaryToRomanNumerals("111110100")); // 500
        assertEquals("DCCLXXXIX", exercise08.binaryToRomanNumerals("1100010101")); // 789
        assertEquals("MCMXCIX", exercise08.binaryToRomanNumerals("11111001111")); // 1999
    }
}
