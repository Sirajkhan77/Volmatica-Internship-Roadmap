package Week3.Day4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testing2 {
    public static void main(String[] args) {
        List<Integer> list =  List.of(1,2,3,3,4,4,5,5,4,3,4,6,8,0,7,5,3,45,7,89);
        System.out.println();
        System.out.println("List of Distinct Reversed Sorted Numbers, And Limit 5 + Skip 2");
        System.out.println("Total List Size = "+ list.stream().count());
        list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .limit(5)
                .forEach(x->System.out.print(" -> "+x));
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("Removing Duplicate Strings ");
        List<String> names = List.of(
                "Ali",
                "Sara",
                "Ali",
                "Ahmed",
                "Sara"
        );
        int c = Math.toIntExact(names.stream().count());
        System.out.println("Total names: "+c);

        names.stream()
                .distinct()
                .forEach(x->System.out.print(" -> "+x));
        System.out.println();
        System.out.println("----------------------------------------------");

        Map<Integer, Integer> counter =
        list.stream()
                .collect(Collectors.toMap(
                        e->e,
                        v ->1,
                        (o,n)->o+1
                ));
        for (Map.Entry<Integer, Integer> entry: counter.entrySet()){
            System.out.println("Key = "+ entry.getKey()+ " and Value = "+entry.getValue());
        }

        System.out.println();
        System.out.println("==============================================");
        Map<String,List<Integer>> result =
                list.stream()
                        .collect(
                                Collectors.groupingBy(
                                        n -> n % 2 == 0 ? "Even":"Odd"
                                )
                        );

        for (Map.Entry<String, List<Integer>>entry: result.entrySet()){
            System.out.println("Key = "+ entry.getKey()+ " and Value = "+entry.getValue());
        }

    }
}
