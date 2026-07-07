package Week1.Day3;
import java.util.Arrays;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean answer = isAnagram(s, t);
        System.out.println("Is Anagram: " + answer);
    }
}
