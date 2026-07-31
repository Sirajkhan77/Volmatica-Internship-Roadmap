package Week4.Day3;
public class Synchronization {
    static int methodCounter = 0;
    static int blockCounter = 0;
    static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Runnable safeTask = () -> {
            for (int i = 0; i < 1000; i++) {
                incrementWithMethod();
                incrementWithBlock();
            }
        };

        Thread t1 = new Thread(safeTask);
        Thread t2 = new Thread(safeTask);

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Method Counter (Safe): " + methodCounter); // Will be 2000
        System.out.println("Block Counter (Safe): " + blockCounter);   // Will be 2000
    }

    // Technique 1: Synchronized Method (Locks the entire method)
    public static synchronized void incrementWithMethod() {
        methodCounter++;
    }

    // Technique 2: Synchronized Block (Locks only a specific piece of code)
    public static void incrementWithBlock() {
        // We only lock the critical section, letting other code in this method run freely
        synchronized (lock) {
            blockCounter++;
        }
    }
}
