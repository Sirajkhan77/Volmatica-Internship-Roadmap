package Week3.Day4;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Testing3 {
    public static void main(String[] args) {
        List<Integer> nums =
                List.of(1,2,2,3);

        Set<Integer> unique =
                nums.stream()
                        .collect(Collectors.toSet());

        System.out.println(unique);

        System.out.println("==========================================");
        List<Integer> nums2 = List.of(1, 2, 3, 4, 5);

        int sum = nums2.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);

        System.out.println("==============================================");
        List<Integer> nums3 =
                List.of(3,7,2,9,5);

        int max =
                nums3.stream()
                        .reduce(Integer.MIN_VALUE,
                                Integer::max);

        System.out.println(max);


        System.out.println("================================================");
        List<String> words =
                List.of("Java"," ","Stream");

        String result =
                words.stream()
                        .reduce("", String::concat);

        System.out.println(result);

    }
}
