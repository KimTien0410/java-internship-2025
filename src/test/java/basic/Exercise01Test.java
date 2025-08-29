package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise01Test {
    @Test
    void getGCDAndLCM_OK() {
        final Exercise01 exercise01 = new Exercise01();
        assertEquals(2, exercise01.getGCD(2,4));
        assertEquals(1, exercise01.getGCD(2,3));
        assertEquals(6, exercise01.getLCM(2,3));
        assertEquals(12, exercise01.getLCM(3,4));
    }
}
