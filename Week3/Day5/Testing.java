package Week3.Day5;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
public class Testing {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("Week3/Day5/students.txt");
        Path path2 = Path.of("Week3/Day5/hello.txt");
        List<String> lines =
                Files.readAllLines(path);

        for(String line : lines){
            System.out.println(line);
        }

        System.out.println("===========================");

        BufferedReader reader =
                Files.newBufferedReader(path2);

        String line;

        while((line = reader.readLine()) != null){
            System.out.println(line);
        }

        reader.close();
    }
}
