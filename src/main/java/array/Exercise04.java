package array;

public class Exercise04 {
    public int[] mergeSortedArrays(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (array1[i] < array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }

        while (i < n1) {
            result[k++] = array1[i++];
        }

        while (j < n2) {
            result[k++] = array2[j++];
        }
        return result;
    }
}
