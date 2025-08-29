package stream;

import java.util.Arrays;

public class Exercise03 {
    String[] names = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public String readNumber(final int number) {
        return Arrays.stream(String.valueOf(number).split(""))
                .map(digit -> names[Integer.parseInt(digit)])
                .reduce((a, b) -> a + ", " + b)
                .orElse("");
    }
}
