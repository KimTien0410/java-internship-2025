package basic;

public class Exercise03 {

    public String analyzeNumber(int number) {
        StringBuffer sb = new StringBuffer();
        for(int i = 2; i * i <= number; i++){
            while(number % i == 0){
                number /= i;
                sb.append(i).append("*");
            }
        }
        if(number > 1) {
            sb.append(number).append("*");
        }
        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }
}
