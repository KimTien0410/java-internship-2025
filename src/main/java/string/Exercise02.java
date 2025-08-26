package string;

public class Exercise02 {
    public boolean isNumber(String str) {
        if(str == null || str.isEmpty()) {
            return false;
        }
        for(char c : str.toCharArray()) {
            if(!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    public boolean isDouble(String str) {
        if(str == null || str.isEmpty()) {
            return false;
        }
        int dotCount = 0;
        for(char c : str.toCharArray()) {
            if(c == '.') {
                dotCount++;
                if(dotCount > 1) {
                    return false;
                }
                continue;
            }
            if(!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    public int sumNumbers(String str) {

        if(str == null || str.isEmpty()) {
            return 0;
        }
        int sum = 0;
        String[] parts = str.split("\\D+");
        for(int i = 0; i < parts.length; i++) {
            if(isNumber(parts[i])) {
                if (isDouble(parts[i])) {
                    String[] temp = parts[i].split(".");
                    for (int j = 0; j < temp.length; j++) {
                        if (isNumber(temp[j])) {
                            sum += Integer.parseInt(temp[j]);
                        }
                    }
                } else {
                    sum += Integer.parseInt(parts[i]);
                }
            }
        }
        return sum;
    }
}
