package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise02Test {
    @Test
    public void shouldSumNumber_OK(){
        final Exercise02 exercise02 = new Exercise02();
        assertEquals(123, exercise02.sumNumbers("abc123xyz"));
        assertEquals(44, exercise02.sumNumbers("aa11b33"));
        assertEquals(18, exercise02.sumNumbers("7 11"));
        assertEquals(0, exercise02.sumNumbers("Chocolate"));
        assertEquals(7, exercise02.sumNumbers("5hoco1a1e"));
        assertEquals(0, exercise02.sumNumbers(""));
        assertEquals(7, exercise02.sumNumbers("5$$1;;1!!"));
        assertEquals(1245, exercise02.sumNumbers("a1234bb11"));
        assertEquals(49, exercise02.sumNumbers("12ab30bc7"));
        assertEquals(26, exercise02.sumNumbers("12.4ab3.0bc.7"));
    }
}
