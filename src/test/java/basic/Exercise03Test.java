package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise03Test {
    @Test
    void testAnalyzeNumber() {
        final Exercise03 exercise03 = new Exercise03();
        assertEquals("2*2*3*5", exercise03.analyzeNumber(60));
        assertEquals("3*7", exercise03.analyzeNumber(21));
        assertEquals("2*2*2*3*5*5", exercise03.analyzeNumber(600));
        assertEquals("7", exercise03.analyzeNumber(7));
        assertEquals("13", exercise03.analyzeNumber(13));
        assertEquals("2*11", exercise03.analyzeNumber(22));
        assertEquals("2*2*2*3", exercise03.analyzeNumber(24));
    }
}
