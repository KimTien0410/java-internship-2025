package string;

import org.junit.jupiter.api.Test;

public class Exercise03Test {
    @Test
    void shouldCheckRepeat_OK() {
        final Exercise03 exercise03 = new Exercise03();
        assert(exercise03.checkRepeated("abab"));
        assert(exercise03.checkRepeated("abcabc"));
        assert(exercise03.checkRepeated("abcabcabc"));
        assert(exercise03.checkRepeated("abcdabcd"));
        assert(!exercise03.checkRepeated("abcd"));
        assert(!exercise03.checkRepeated("abcde"));
    }
}
