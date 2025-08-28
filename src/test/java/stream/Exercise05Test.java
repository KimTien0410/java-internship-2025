package stream;

import org.junit.jupiter.api.Test;

public class Exercise05Test {
    @Test
    public void shouldSumMaxDigitNumber_OK() {
        final Exercise05 exercise05 = new Exercise05();
        assert exercise05.sumMaxDigitNumber(new int[]{1, 22, 333, 44, 5}) == 333;
        assert exercise05.sumMaxDigitNumber(new int[]{123, 45, 6, 7890}) == 7890;
        assert exercise05.sumMaxDigitNumber(new int[]{7, 89, 1234, 5678}) == 6912;
        assert exercise05.sumMaxDigitNumber(new int[]{0, 1, 2, 3}) == 6;
        assert exercise05.sumMaxDigitNumber(new int[]{9, 99, 999}) == 999;
        assert exercise05.sumMaxDigitNumber(new int[]{10, 20, 30, 40}) == 100;
    }
}
