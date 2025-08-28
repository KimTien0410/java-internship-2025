package stream;

import java.util.Arrays;

import static java.util.Arrays.stream;

public class Exercise05 {
    public int sumMaxDigitNumber(final int[] numbers) {
        int maxDigits = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .mapToInt(String::length)
                .max()
                .orElse(0);
        return stream(numbers)
                .filter(num -> String.valueOf(num).length() == maxDigits)
                .sum();
    }
}
