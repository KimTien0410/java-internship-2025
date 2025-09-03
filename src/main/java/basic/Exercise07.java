package basic;

public class Exercise07 {
    public int toDecimalReverse(int n) {
        int decimal = 0;
        while (n > 0) {
            decimal = (decimal << 1) | (n & 1);
            n >>= 1;
        }
        return decimal;
    }
}
