package string;

import org.junit.jupiter.api.Test;

public class Exercise02Test {
    @Test
    public void sumNumberTest_OK(){
        final Exercise02 exercise02 = new Exercise02();
        assert(exercise02.sumNumbers("abc123xyz") == 123);
        assert(exercise02.sumNumbers("aa11b33") == 44);
        assert(exercise02.sumNumbers("7 11") == 18);
        assert(exercise02.sumNumbers("Chocolate") == 0);
        assert(exercise02.sumNumbers("5hoco1a1e") == 7);
        assert(exercise02.sumNumbers("") == 0);
        assert(exercise02.sumNumbers("5$$1;;1!!") == 7);
        assert(exercise02.sumNumbers("a1234bb11") == 1245);
        assert(exercise02.sumNumbers("12ab30bc7") == 49);
        assert(exercise02.sumNumbers("12.4ab3.0bc.7") == 26);
    }
}
