package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise05Test {

    @Test
    public void shouldExtendString_OK() {
        final Exercise05 exercise05 = new Exercise05();
        assertEquals("aaabccccde", exercise05.extendString("a3bc4de"));
        assertEquals("xxxyzzzzzz", exercise05.extendString("x3yz6"));
        assertEquals("abcd", exercise05.extendString("abcd"));
        assertEquals("a", exercise05.extendString("a1"));
        assertEquals("", exercise05.extendString(""));
        assertEquals("aa", exercise05.extendString("a2"));
        assertEquals("aaaaaaaaaaa", exercise05.extendString("a11"));
    }
}
