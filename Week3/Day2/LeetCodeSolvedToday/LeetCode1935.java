package Week3.Day2.LeetCodeSolvedToday;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = new HashSet<>();
        for (char x: brokenLetters.toCharArray()){
            set.add(x);
        }
        List<String> words = Arrays.asList(text.split("\\s+"));
        int count=0;
        for (String word : words){
            boolean yes= false;
            for (char c: word.toCharArray()){
                if (set.contains(c)) {
                    yes=false;
                    break;
                }
                yes=true;
            }
            if(yes) count++;
        }
        return count;
    }
}
