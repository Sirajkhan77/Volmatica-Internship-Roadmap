package Week4.Day3;

public class RaceCondition {
    // Shared mutable state - both threads will touch this
    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable countingTask = () -> {
            for (int i = 0; i < 1000; i++) {
                counter++; // This is actually 3 steps: read, add, save. Threads interrupt each other here.
            }
        };

        Thread t1 = new Thread(countingTask);
        Thread t2 = new Thread(countingTask);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // You expect 2000, but it will likely print something like 1432
        System.out.println("Final count (Broken): " + counter);
    }
}
