package Week1.Day3;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;

        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        int number = 121;

        boolean answer = isPalindrome(number);

        System.out.println("Is Palindrome: " + answer);
    }
}