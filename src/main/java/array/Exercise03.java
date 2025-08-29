package array;

public class Exercise03 {
    public int[] reverseArray(final int[] array) {
        int n = array.length;
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
        return array;
    }
}
