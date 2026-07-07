package Week1.Day3;

public class PowerOfFour {

    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        int number = 64;
        boolean answer = isPowerOfFour(number);
        System.out.println("Is Power of Four: " + answer);
    }
}
