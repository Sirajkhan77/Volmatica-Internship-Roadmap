package Week4.Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SimpleExecutor {

    public static void main(String[] args) throws Exception {
        // 1. Create a thread pool with exactly 2 worker threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // 2. A thread-safe list. Multiple threads can add to this at the same time without crashing.
        List<String> completedFiles = new CopyOnWriteArrayList<>();

        // A standard list just to hold our Future (IOU) objects
        List<Future<Integer>> futures = new ArrayList<>();

        System.out.println("Submitting tasks...");

        // 3. Submit 3 tasks to the executor
        for (int i = 1; i <= 3; i++) {
            SimpleTask task = new SimpleTask("File_" + i + ".txt", completedFiles);
            Future<Integer> future = executor.submit(task);
            futures.add(future);
        }

        int totalWords = 0;

        // 4. Retrieve results
        for (Future<Integer> f : futures) {
            // BLOCKING CALL: The main thread pauses here until the task returns its integer
            totalWords += f.get();
        }

        System.out.println("\nAll tasks finished!");
        System.out.println("Total words counted: " + totalWords);
        System.out.println("Thread-safe list of completed files: " + completedFiles);

        // 5. Shut down the executor so the Java program can actually exit
        executor.shutdown();
    }
}