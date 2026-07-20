package Week2.Day4;

import java.util.HashSet;
import java.util.Set;

public class LeetCode575 {
    public int distributeCandies(int[] c) {
        Set<Integer> mySet = new HashSet<>();
        for (int i: c){
            mySet.add(i);
        }
        int types= mySet.size();
        if (types>c.length/2){
            return c.length/2;
        }
        return types;
    }

    public static void main(String[] args) {
        int[] candyType = {1,1,2,2,3,3};
        System.out.println(new LeetCode575().distributeCandies(candyType));
    }
}
