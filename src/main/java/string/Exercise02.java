package string;

public class Exercise02 {

    public int sumNumbers(String str) {
        int sum = 0;
        final StringBuilder builder = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                builder.append(c);
            } else {
                if(!builder.isEmpty()) {
                    sum += Integer.parseInt(builder.toString());
                    builder.setLength(0);
                }
            }
        }
        if(!builder.isEmpty()) {
            sum += Integer.parseInt(builder.toString());
        }
        return sum;
    }
}
