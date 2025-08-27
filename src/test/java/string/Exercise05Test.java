package string;

import org.junit.jupiter.api.Test;

public class Exercise05Test {

    @Test
    public void shouldExtendString_OK() {
        final Exercise05 exercise05 = new Exercise05();
        assert "aaabccccde".equals(exercise05.extendString("a3bc4de"));
        assert "xxxyzzzzzz".equals(exercise05.extendString("x3yz6"));
        assert "abcd".equals(exercise05.extendString("abcd"));
        assert "a".equals(exercise05.extendString("a1"));
        assert "".equals(exercise05.extendString(""));
        assert "aa".equals(exercise05.extendString("a2"));
        assert "aaaaaaaaaaa".equals(exercise05.extendString("a11"));
    }
}
