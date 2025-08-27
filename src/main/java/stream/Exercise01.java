package stream;

import static java.util.Arrays.stream;

public class Exercise01 {
    public long differentOddsAndEvens(int[] numbers) {
        return stream(numbers).filter(n -> n % 2 == 0).sum() - stream(numbers).filter(n -> n % 2 != 0).sum();
    }
}
