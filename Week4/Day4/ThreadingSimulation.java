package Week4.Day4;
public class ThreadingSimulation {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("--- PHASE 1: WITHOUT SYNCHRONIZATION (Race Condition) ---");
        BankAccount unsafeAccount = new BankAccount(100);

        // Creating threads using Runnable (Preferred method)
        Thread t1 = new Thread(new WithdrawalTask(unsafeAccount, 80, false), "Thread-Alice");
        Thread t2 = new Thread(new WithdrawalTask(unsafeAccount, 80, false));
        Thread t5= new Thread(new WithdrawalTask(unsafeAccount, 80, false));
        t1.start();
        t2.start();

        // Using join() to wait for both threads to finish before printing the final balance
        t1.join();
        t2.join();

        System.out.println("Final Unsafe Balance: $" + unsafeAccount.getBalance());
        System.out.println("\n--- PHASE 2: WITH SYNCHRONIZATION (Safe) ---");

        BankAccount safeAccount = new BankAccount(100);

        Thread t3 = new Thread(new WithdrawalTask(safeAccount, 80, true), "Thread-Charlie");
        Thread t4 = new Thread(new WithdrawalTask(safeAccount, 80, true), "Thread-Diana");

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println("Final Safe Balance: $" + safeAccount.getBalance());
    }
}