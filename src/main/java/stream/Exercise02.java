package stream;

import static java.util.Arrays.stream;

public class Exercise02 {
    public int findNumberNotInArray(int[] array){
        int length = array.length;
        return ((length + 1) * (length + 2) / 2) -  stream(array).sum();
    }
}
