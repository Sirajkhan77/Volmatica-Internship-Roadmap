package Week4.Day5;
import java.util.*;
import java.util.concurrent.*;

public class FileProcessingSimulation {

    public static void main(String[] args) {

        // Sample files
        Map<String, String> files = new HashMap<>();

        files.put("file1.txt", "Java is powerful and Java is popular");
        files.put("file2.txt", "Spring Boot makes Java backend development easier");
        files.put("file3.txt", "Concurrency allows multiple tasks to run efficiently");
        files.put("file4.txt", "ExecutorService manages threads for us");
        files.put("file5.txt", "Callable can return a result from a task");

        // Fixed thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Store Future objects
        List<Future<String>> futures = new ArrayList<>();

        try {

            // Submit five Callable tasks
            for (Map.Entry<String, String> entry : files.entrySet()) {

                String fileName = entry.getKey();
                String content = entry.getValue();

                Callable<String> task = () -> {

                    System.out.println(
                            Thread.currentThread().getName()
                                    + " processing " + fileName
                    );

                    // Simulate file-processing time
                    Thread.sleep(1000);

                    // Count words
                    int wordCount = content.split("\\s+").length;

                    return fileName + " contains " + wordCount + " words";
                };

                Future<String> future = executor.submit(task);

                futures.add(future);
            }

            // Collect results
            System.out.println("\nResults:");

            for (Future<String> future : futures) {

                // BLOCKING POINT
                String result = future.get();

                System.out.println(result);
            }

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

            System.out.println("Main thread was interrupted.");

        } catch (ExecutionException e) {

            System.out.println("Task failed: " + e.getCause());

        } finally {

            // Properly shut down executor
            executor.shutdown();

            System.out.println("\nExecutor shutdown requested.");
        }
    }
}