package array;

public class Exercise01 {
    public int differenceSumEvensAndSumOdds(final int[] numbers){
        int sumOdds = 0;
        int sumEvens = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEvens += number;
            } else {
                sumOdds += number;
            }
        }
        return sumEvens - sumOdds;
    }
}
