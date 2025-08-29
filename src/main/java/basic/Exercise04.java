package basic;

public class Exercise04 {
    public String fibonacciArray(int max) {
        StringBuilder result = new StringBuilder();
        int a = 1, b = 1;
        result.append(a);
        while (b < max) {
            result.append(" ").append(b);
            int next = a + b;
            a = b;
            b = next;
        }
        return result.toString();
    }
}
