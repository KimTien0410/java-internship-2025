package string;

public class Exercise03 {
    public boolean checkRepeated(final String str) {
        final int len = str.length();
        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) {
                final String subStr = str.substring(0, i);
                final StringBuilder sb = new StringBuilder();
                for (int j = 0; j < len / i; j++) {
                    sb.append(subStr);
                }
                if (sb.toString().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

}
