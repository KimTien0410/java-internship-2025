package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise03Test {
    @Test
    void testAnalyzeNumber() {
        final Exercise03 exercise03 = new Exercise03();
        assertEquals("2*11", exercise03.analyzeNumber(22));
        assertEquals("2*2*2*3", exercise03.analyzeNumber(24));
    }
}
