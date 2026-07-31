package Week3.Day3;

@FunctionalInterface
interface Printer {

    void print(String msg);

    default void start() {
        System.out.println("Starting...");
    }

    static void stop() {
        System.out.println("Stopped");
    }
}
