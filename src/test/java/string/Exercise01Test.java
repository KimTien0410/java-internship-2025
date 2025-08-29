package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercise01Test {

    @Test
    void shouldCheckSymmetric_OK() {
        final Excersice01 excersice = new Excersice01();
        assertTrue(excersice.isSymmetric("madam"));
        assertTrue(excersice.isSymmetric("racecar"));
        assertTrue(excersice.isSymmetric("a"));
        assertTrue(excersice.isSymmetric(""));
        assertTrue(excersice.isSymmetric(null));
        assertFalse(excersice.isSymmetric("hello"));
        assertFalse(excersice.isSymmetric("abc"));
        assertFalse(excersice.isSymmetric("ab"));

    }
}
