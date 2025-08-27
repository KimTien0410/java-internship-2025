package array;

import org.junit.jupiter.api.Test;

public class Exercise02Test {
    @Test
    void shouldSearchBinary_OK() {
        final Exercise02 exercise02 = new Exercise02();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assert exercise02.searchBinary(array, 1) == 0;
        assert exercise02.searchBinary(array, 5) == 4;
        assert exercise02.searchBinary(array, 10) == 9;
        assert exercise02.searchBinary(array, 11) == -1;
        assert exercise02.searchBinary(array, -1) == -1;
    }
}
