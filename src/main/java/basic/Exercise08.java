package basic;

public class Exercise08 {

    public int toDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(length - 1 - i);
            if (bit == '1') {
                decimal += Math.pow(2, i);
            } else if (bit != '0') {
                throw new IllegalArgumentException("Invalid binary number");
            }
        }

        return decimal;
    }

    public String binaryToRomanNumerals(String binary) {
        int number = toDecimal(binary);
        if (number <= 0 || number > 3999) {
            throw new IllegalArgumentException("Number out of range (1-3999)");
        }

        String[] romanNumerals = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };

        int[] values = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };

        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                roman.append(romanNumerals[i]);
                number -= values[i];
            }
        }

        return roman.toString();
    }
}
