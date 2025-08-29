package array;

public class Exercise05 {
    public int searchX(final int[] array){
        int realArrayLength = array.length + 1;
        int expectedSum = (1 + realArrayLength) * realArrayLength / 2;
        int sumArray = 0;
        for(int i : array){
            sumArray += i;
        }
        return expectedSum - sumArray;
    }
}
