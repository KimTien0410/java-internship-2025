package basic;

public class Exercise01 {
    public int getGCD(int a, int b) {
        if (b == 0) return a;

        return getGCD(b, a % b);
    }

    public int getLCM(int a, int b) {
        return a * b / getGCD(a, b);
    }
}
