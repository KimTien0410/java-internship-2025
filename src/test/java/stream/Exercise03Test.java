package stream;

import org.junit.jupiter.api.Test;

public class Exercise03Test {
    @Test
    void shouldReadNumber_OK() {
        final Exercise03 exercise03 = new Exercise03();
        assert "One, Two, Three".equals(exercise03.readNumber(123));
        assert "One, Two, Three, Four, Five".equals(exercise03.readNumber(12345));
        assert "Zero".equals(exercise03.readNumber(0));
        assert "One".equals(exercise03.readNumber(1));
        assert "Nine".equals(exercise03.readNumber(9));
        assert "One, Nine".equals(exercise03.readNumber(19));
    }
}
