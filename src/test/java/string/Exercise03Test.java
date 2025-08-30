package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercise03Test {
    @Test
    void shouldCheckRepeat_OK() {
        final Exercise03 exercise03 = new Exercise03();
        assertTrue(exercise03.checkRepeated("abab"));
        assertTrue(exercise03.checkRepeated("abcabc"));
        assertTrue(exercise03.checkRepeated("abcabcabc"));
        assertTrue(exercise03.checkRepeated("abcdabcd"));
        assertFalse(exercise03.checkRepeated("abcd"));
        assertFalse(exercise03.checkRepeated("abcde"));
    }
}
