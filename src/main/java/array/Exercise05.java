package array;

public class Exercise05 {
    public int searchX(int[] array){
        int lengthReal = array.length + 1;
        int sum = (1 + lengthReal) * lengthReal / 2;
        int sumArray = 0;
        for(int i : array){
            sumArray += i;
        }
        return sum - sumArray;
    }
}
