package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise04Test {

    @Test
    void shouldCutString_OK() {
        final Exercise04 exercise04 = new Exercise04();
        assertEquals("a3b2c", exercise04.cutString("aaabbc"));
        assertEquals("abc", exercise04.cutString("abc"));
        assertEquals("a5", exercise04.cutString("aaaaa"));
        assertEquals("abab", exercise04.cutString("abab"));
        assertEquals("a4b4a2b2", exercise04.cutString("aaaabbbbaabb"));
        assertEquals("", exercise04.cutString(""));
        assertEquals("ab13c", exercise04.cutString("abbbbbbbbbbbbbc"));
    }

}
