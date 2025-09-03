package string;

import java.util.HashMap;
import java.util.Map;

public class Exercise04 {
    public String cutString(final String str) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            int count = 1;
            while(i + 1 < str.length() && str.charAt(i + 1) == ch){
                ++count;
                ++i;
            }
            if(count > 1){
                result.append(ch).append(count);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
