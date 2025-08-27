package string;

import org.junit.jupiter.api.Test;

public class Exercise06Test {
    @Test
    void shouldCheckBarcode_OK() {
        final Exercise06 exercise06 = new Exercise06();
        assert exercise06.checkBarcode("4006381333931");
        assert exercise06.checkBarcode("9780306406157");
        assert exercise06.checkBarcode("9781861972712");
        assert !exercise06.checkBarcode("1234567890129");
        assert exercise06.checkBarcode("5901234123457");
        assert !exercise06.checkBarcode("4006381333932");
        assert !exercise06.checkBarcode("400638133393");
        assert !exercise06.checkBarcode("40063813339312");
        assert !exercise06.checkBarcode("40063813339A1");
        assert !exercise06.checkBarcode(null);
    }
}
