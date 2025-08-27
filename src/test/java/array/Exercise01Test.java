package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise01Test {
    @Test
    void shouldDifferenceSumEvensAndSumOdds_OK() {
        final Exercise01 exercise01 = new Exercise01();
        assertEquals(-2, exercise01.differenceSumEvensAndSumOdds(new int[]{1, 2, 3}));
        assertEquals(-4, exercise01.differenceSumEvensAndSumOdds(new int[]{1, 1, 1, 1}));
        assertEquals(12, exercise01.differenceSumEvensAndSumOdds(new int[]{2, 4, 6}));
        assertEquals(-16, exercise01.differenceSumEvensAndSumOdds(new int[]{1, 3, 5, 7}));
        assertEquals(0, exercise01.differenceSumEvensAndSumOdds(new int[]{}));
    }
}
