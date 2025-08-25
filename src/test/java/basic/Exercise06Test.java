package basic;

import org.junit.jupiter.api.Test;

public class Exercise06Test {
    @Test
    void shouldReadMonth_OK() {
        final Exercise06 exercise06 = new Exercise06();
        assert "January".equals(exercise06.readMonth(1));
        assert "February".equals(exercise06.readMonth(2));
        assert "March".equals(exercise06.readMonth(3));
        assert "April".equals(exercise06.readMonth(4));
        assert "May".equals(exercise06.readMonth(5));
        assert "June".equals(exercise06.readMonth(6));
        assert "July".equals(exercise06.readMonth(7));
        assert "August".equals(exercise06.readMonth(8));
        assert "September".equals(exercise06.readMonth(9));
        assert "October".equals(exercise06.readMonth(10));
        assert "November".equals(exercise06.readMonth(11));
        assert "December".equals(exercise06.readMonth(12));
        assert "Invalid month".equals(exercise06.readMonth(0));
        assert "Invalid month".equals(exercise06.readMonth(13));
    }
}
