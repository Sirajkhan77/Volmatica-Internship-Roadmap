package Week4.Day5;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorBasics {
    public static void main(String[] args) throws Exception {
        // Creating a pool with 2 threads to avoid unlimited thread creation risk
        ExecutorService pool = Executors.newFixedThreadPool(2);

        // 1. Submit a Runnable (No return value, just does work)
        pool.submit(() -> {
            System.out.println("Runnable Task: I am just printing a message.");
        });

        pool.submit(()->{
            System.out.println("Hello siraj..");
        });

        // 2. Submit a Callable (Returns a value)
        Callable<String> myCallable = () -> {
            Thread.sleep(1000); // Simulate 1 second of work
            return "Hello from Callable!";
        };

        Callable<Integer> myCallAbleInteger = ()->{
            return 23;
        };
        System.out.println("My age from calllable is : "+ myCallAbleInteger);
        // We get a Future instantly, which is a promise for the result
        Future<String> futureResult = pool.submit(myCallable);
        Future<Integer> futureAge =  pool.submit(myCallAbleInteger);
        System.out.println("My Age is : " + futureAge.get());

        System.out.println("Main: Waiting for Callable result...");

        // 3. Blocking call - wait for the result
        String result = futureResult.get();
        System.out.println("Main: Got the result -> " + result);

        // 4. Proper Shutdown - if you forget this, the app runs forever
        pool.shutdown();
    }
}
