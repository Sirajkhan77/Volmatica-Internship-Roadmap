package Week4.Day4;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws Exception {

        ExecutorService executor =
                Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {

            return 10 * 20;

        };

        Future<Integer> future =
                executor.submit(task);

        Integer answer = future.get();

        System.out.println(answer);

        executor.shutdown();

    }

}