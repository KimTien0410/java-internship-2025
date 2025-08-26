package basic;

public class Exercise03 {

    public boolean isPrime(int number) {

        if( number <= 1 ){
            return false;
        }

        for( int i = 2; i <= Math.sqrt( number ); i++ ){
            if( number % i == 0 ){
                return false;
            }
        }
        return true;
    }

    public StringBuffer analyzeNumber( int number ) {
        StringBuffer sb = new StringBuffer();

        for( int i = 2; i <= number; i++ ){
            if( number % i == 0 && isPrime(i)){

                while( number % i == 0 ){
                    number /= i;
                    sb.append(i).append("*");
                }

            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb;
    }
}
