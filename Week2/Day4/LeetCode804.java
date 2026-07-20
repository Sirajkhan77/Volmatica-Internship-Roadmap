package Week2.Day4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        int i=0;
        while (i<26){
            map.put(letters[i], codes[i]);
            i++;
        }
        for (String word: words){
            for (char c: word.toCharArray()){
                sb.append(map.get(c));
            }
            set.add(sb.toString());
            sb.setLength(0);
        }
        return set.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        LeetCode804 leetCode804 = new LeetCode804();
        System.out.println(leetCode804.uniqueMorseRepresentations(words));
    }
}
