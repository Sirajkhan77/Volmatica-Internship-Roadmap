package Week1.Day4;
import java.util.Scanner;
public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s = sc.nextLine().toLowerCase();
        int v=0, c=0, sp=0, d=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>'a'&& s.charAt(i)<'z') {
                if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
                    v++;
                } else {
                    c++;
                }
            }
            else if (s.charAt(i)>'0'&& s.charAt(i)<'9') {
                d++;
            }else if (s.charAt(i)==' ') {
                sp++;
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        System.out.println("Digits: " + d);
        System.out.println("Spaces: " + sp);
        sc.close();
    }
}