package string;

import org.junit.jupiter.api.Test;

public class Exercise01Test {

    @Test
    void shouldCheckSymmetric_OK() {
        final Excersice01 excersice = new Excersice01();
        assert excersice.isSymmetric("madam");
        assert excersice.isSymmetric("racecar");
        assert excersice.isSymmetric("a");
        assert excersice.isSymmetric("");
        assert excersice.isSymmetric(null);
        assert !excersice.isSymmetric("hello");
        assert !excersice.isSymmetric("abc");
        assert !excersice.isSymmetric("ab");

    }
}
