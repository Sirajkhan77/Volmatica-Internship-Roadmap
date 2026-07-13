package Week2.Day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode506 {
    public String[] findRelativeRanks(int[] score) {
        if (score.length==1) return new String[]{"Gold Medal"};
        if (score.length==2) {
            if(score[0]>score[1]){
                return new String[]{"Gold Medal", "Silver Medal"};
            }else{
                return new String[]{"Silver Medal", "Gold Medal"};
            }
        }

        int[] copy = Arrays.copyOf(score, score.length);
        Arrays.sort(copy);

        Map<Integer, String> map = new HashMap<>();
        map.put(copy[copy.length-1], "Gold Medal");
        map.put(copy[copy.length-2], "Silver Medal");
        map.put(copy[copy.length-3], "Bronze Medal");

        String[] ans= new String[score.length];
        if (score.length==3){
            for (int i=0; i<score.length; i++){
                ans[i]=map.get(score[i]);
            }
        }

        int rank=4;
        for (int i=copy.length-4; i>=0; i--){
            map.put(copy[i], String.valueOf(rank));
            rank++;
        }
        for (int i=0; i<score.length; i++){
            ans[i]=map.get(score[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode506 leetCode506 = new LeetCode506();
        int[] score = {10, 3, 8, 9, 4};
        String[] result = leetCode506.findRelativeRanks(score);
        System.out.print("Relative Ranks: ");
        for (String rank : result) {
            System.out.print(rank + " ");
        }
    }
}
