package Week3.Day2.LeetCodeSolvedToday;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode1941 {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char x: s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        Set<Integer> set= new HashSet<>();
        for (int val: map.values()){
            set.add(val);
        }
        if (set.size()>1) return false;
        return true;
    }
}
