package Week4.Day3;

public class SleepAndJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            System.out.println("Worker: Starting heavy work...");
            try {
                // sleep() pauses THIS thread for 2 seconds
                System.out.println("Thread Slept for 5 seconds.. ");
                Thread.sleep(5000);
            } catch (InterruptedException e) {}
            System.out.println("Worker: Work finished!");
        });

        worker.start();

        System.out.println("Main: Waiting for the worker to finish...");

        // join() forces the Main thread to freeze here until 'worker' is totally done
        worker.join();

        System.out.println("Main: Worker is done, main thread can now exit.");
    }
}