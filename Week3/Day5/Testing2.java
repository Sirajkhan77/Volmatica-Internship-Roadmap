package Week3.Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.*;
import java.nio.file.*;

public class Testing2 {

    public static void main(String[] args) throws IOException {
        List<String> names =
                List.of("Ali Bhai Jan ","Ahmed Bhai","Sara Baji ");
        Path path = Path.of("Week3/Day5/notes.txt");

        Files.write(path, names);

        PrintWriter writer =
                new PrintWriter("Week3/Day5/notes2.txt");

        writer.println("Ali");
        writer.println("Ahmed");
        writer.println("Sara");

        writer.close();

        try (BufferedReader reader =
                     Files.newBufferedReader(Path.of("Week3/Day5/notes.txt"))) {

            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

        }
    }
}
