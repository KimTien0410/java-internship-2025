package string;

import java.util.HashMap;

public class Exercise05 {
    public String extendString(final String str){
        StringBuilder sb = new StringBuilder();
        //a13bc --> aaaaaaaaaaaaabc

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                int count = ch - '0';
                // check for multi-digit numbers
                while (i + 1 < str.length() && Character.isDigit(str.charAt(i + 1))) {
                    count = count * 10 + (str.charAt(i + 1) - '0');
                    i++;
                }
                char lastChar = sb.charAt(sb.length() - 1);
                sb.append(String.valueOf(lastChar).repeat(Math.max(0, count - 1)));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
