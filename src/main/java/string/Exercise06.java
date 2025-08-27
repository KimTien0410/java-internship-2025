package string;

public class Exercise06 {
    public boolean checkBarcode(final String code) {
        int sumEven = 0;
        int sumOdd =0;
        if (code == null || code.length() != 13) {
            return false;
        }
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
            int digit = Character.getNumericValue(c);
            if (i % 2 == 0) {
                sumOdd += digit;
            } else {
                sumEven += digit;
            }
        }
        int total = sumOdd + sumEven * 3;
        return total % 10 == 0;
    }
}
