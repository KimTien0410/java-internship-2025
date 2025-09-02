package basic;

public class Exercise07 {
    public String toBinary(int n) {
        return Integer.toBinaryString(n);
    }

    public int toDecimalReverse(int n) {
        final StringBuilder binaryStr = new StringBuilder(toBinary(n));
        binaryStr.reverse();
        int decimal = 0;
        int length = binaryStr.length();

        for (int i = 0; i < length; i++) {
            char bit = binaryStr.charAt(length - 1 - i);
            if (bit == '1') {
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }
}
