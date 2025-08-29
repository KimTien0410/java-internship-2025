package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercise06Test {
    @Test
    void shouldCheckBarcode_OK() {
        final Exercise06 exercise06 = new Exercise06();
        assertTrue(exercise06.checkBarcode("4006381333931"));
        assertTrue(exercise06.checkBarcode("9780306406157"));
        assertTrue(exercise06.checkBarcode("9781861972712"));
        assertFalse(exercise06.checkBarcode("1234567890129"));
        assertTrue(exercise06.checkBarcode("5901234123457"));
        assertFalse(exercise06.checkBarcode("4006381333932"));
        assertFalse(exercise06.checkBarcode("400638133393"));
        assertFalse(exercise06.checkBarcode("40063813339312"));
        assertFalse(exercise06.checkBarcode("40063813339A1"));
        assertFalse(exercise06.checkBarcode(null));
    }
}
