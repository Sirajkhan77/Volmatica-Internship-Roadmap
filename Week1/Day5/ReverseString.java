package Week1.Day5;

import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
        int left=0, right=s.length-1;
        while (left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char[] arr = {'S', 'i', 'r', 'A', 'j'};
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(arr);
        System.out.println("Reversed String: " + Arrays.toString(arr));
    }
}