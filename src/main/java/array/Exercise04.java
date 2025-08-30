package array;

public class Exercise04 {
    public int[] mergeSortedArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] result = new int[length1 + length2];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < length1 && j < length2) {
            if (array1[i] < array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }

        while (i < length1) {
            result[k++] = array1[i++];
        }

        while (j < length2) {
            result[k++] = array2[j++];
        }
        return result;
    }
}
