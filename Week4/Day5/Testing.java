package Week4.Day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Testing {
    public static void main(String[] args) {

        Map<String, String> files = new HashMap<>();
        files.put("file1.txt", "Hello this is siraj khan");
        files.put("file2.txt", "Spring Boot makes Java backend development easier");
        files.put("file3.txt", "Concurrency allows multiple tasks to run efficiently");
        files.put("file4.txt", "ExecutorService manages threads for us");
        files.put("file5.txt", "Callable can return a result from a task");
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();
        try {
            for(Map.Entry<String, String> entry: files.entrySet()){
                String filName = entry.getKey();
                String content = entry.getValue();
                Callable<String> callable = ()->{
                    System.out.println(Thread.currentThread().getName()+ " is processing "+ filName);
                    Thread.sleep(1000);
                    int c = content.split("\\s+").length;
                    return filName + " Contains "+ c + " Total Words..";
                };
                Future<String> getResults = executor.submit(callable);
                futures.add(getResults);
            }
            System.out.println("the Results are: ");

        }catch (Exception e){};
    }
}
