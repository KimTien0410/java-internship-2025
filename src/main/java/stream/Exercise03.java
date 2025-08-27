package stream;

import java.util.Arrays;

public class Exercise03 {
    public String readNumber(final int number){
        String[] names={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        return Arrays.stream(String.valueOf(number).split(""))
                .map(digit -> names[Integer.parseInt(digit)])
                .reduce((a,b)->a+", "+b)
                .orElse("");
    }
}
