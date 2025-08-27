package stream;

import static java.util.Arrays.stream;

public class Exercise02 {
    public int findNumberNotInArray(int[] array){
        return ((1 + array.length + 1) * (array.length + 1) / 2) -  stream(array).sum();
    }
}
