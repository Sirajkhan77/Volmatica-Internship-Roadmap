package Week3.Day4;

import java.awt.*;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testing {
    public static void main(String[] args) {
        List<String> names = List.of("Siraj", "Sunzze", "Omer", "Pola", "Amir", "Shaffan", "siraj");
        List<String> results =
                names.stream()
                .filter(name-> name.startsWith("S"))
                .map(String::toUpperCase)
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());
        for (String name: results) System.out.println(name);
//        System.out.println("Hello");
        System.out.println("--------------------------------------------------");
        Stream.of(22,5,428,65,7789,54,32,51,676,9)
                .filter(val->val%2==0)
                .filter(n->n>=100)
                .map(n-> n*2)
                .forEach(System.out::println);
        System.out.println("---------------------------------------------------");
        List<Student> students = List.of(
                new Student("Shaffan", 89),
                new Student("Siraj", 90),
                new Student("hello", 32)
        );
        students.stream()
                .filter(s -> s.marks>=50)
                .forEach(s-> System.out.println(s.name));
        System.out.println("-------------------------------------------");

        Map<String, Integer> map =
                names.stream()
                                .collect(Collectors.toMap(
                                        name -> name,
                                        String::length,
                                        (a,b) ->a
                                ));
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println("Key = "+ entry.getKey()+ " and Value = "+entry.getValue());
        }

        System.out.println();
        System.out.println("===================================================");

        System.out.println("Celsius → Fahrenheit -> Sorted Reverced");
        List<Integer> celsius = List.of(45,78,0, 37,25);

        celsius.stream()
                .map(c -> (c * 9/5) + 32)
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n+ " -> "));
        System.out.println();
        System.out.println("----------------------------------------------");



    }
}
