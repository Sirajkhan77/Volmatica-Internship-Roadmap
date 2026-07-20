package Week3.Day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode884 {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        for (String x: words1){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for (String x: words2){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue()==1){
                list.add(entry.getKey());
            }
        }
        String[] ans = new String[list.size()];
        int i=0;
        for (String word : list) {
            ans[i++]=word;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "this apple is sweet", s2 = "this apple is sour";
        LeetCode884 l1 = new LeetCode884();
        String[] answer = l1.uncommonFromSentences(s1,s2);
        System.out.println("here are the UnCommon Words: ");
        for (String y: answer){
            System.out.print(" -> "+y);
        }
    }
}
