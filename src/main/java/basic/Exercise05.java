package basic;

public class Exercise05 {

    public int factorial(final int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        return number == 0 ? 1 : number * factorial(number - 1);
    }
}
