package string;

import java.util.HashMap;
import java.util.Map;

public class Exercise04 {
    public String cutString(final String str) {
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (Character c : str.toCharArray()) {
            map.put(c.toString(), map.getOrDefault(c.toString(), 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
                result.append(entry.getKey()).append(entry.getValue());
            else {
                result.append(entry.getKey());
            }
        }
        return result.toString();
    }
}
