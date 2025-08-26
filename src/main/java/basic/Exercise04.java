package basic;

public class Exercise04 {

    public int fibonacci(final int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative");
        }
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public String fibonacciArray(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative");
        }
        final StringBuffer result = new StringBuffer();
       int i = 1;

        while( fibonacci(i) < n ){
            result.append(fibonacci(i)).append(" ");
            i++;
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}
