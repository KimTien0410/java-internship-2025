package string;

public class Exercise02 {

    public int sumNumbers(String str) {
        int sum = 0;
        int current = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                current = current * 10 + (c - '0');
            } else {
                sum += current;
                current = 0;
            }
        }
        sum += current;
        return sum;
    }
}
