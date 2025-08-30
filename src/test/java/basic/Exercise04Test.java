package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Exercise04Test {
    @Test
    void testFibonacci() {
        final Exercise04 exercise04 = new Exercise04();
        assertEquals("1 1 2 3 5 8", exercise04.fibonacciArray(10));
        assertEquals("1 1 2 3 5 8 13 21 34", exercise04.fibonacciArray(40));
    }
}
