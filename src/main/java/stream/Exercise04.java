package stream;

import java.util.Arrays;

import static java.util.Arrays.stream;

public class Exercise04 {
    public int[] sortByAlphabeticalOrder(final int[] array){
        return stream(array).mapToObj(String::valueOf).sorted().mapToInt(Integer::parseInt).toArray();
    }
}
