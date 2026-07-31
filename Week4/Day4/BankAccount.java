package Week4.Day4;
class BankAccount {
    // volatile ensures threads always see the latest written value
    private volatile int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // 1. UNSAFE METHOD: Creates a race condition intentionally
    public void withdrawUnsafe(int amount) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " is checking balance...");

        if (balance >= amount) {
            System.out.println(threadName + " sees enough money. Proceeding to withdraw.");

            // Using sleep() to simulate network delay and force a context switch.
            // This guarantees the other thread will sneak in while this one is asleep!
            try { Thread.sleep(50); } catch (InterruptedException e) {}

            balance -= amount;
            System.out.println(threadName + " successfully withdrew $" + amount);
        } else {
            System.out.println(threadName + " failed to withdraw. Insufficient funds.");
        }
    }

    // 2. SAFE METHOD: Using a synchronized method (locks the whole method)
    // public synchronized void withdrawSafe(int amount) { ... }

    // 3. SAFE METHOD: Using a synchronized block (protects just the critical section)
    public void withdrawSafe(int amount) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " is attempting a safe withdrawal...");

        // Critical Section locked to 'this' instance
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(threadName + " has the lock and sees enough money.");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                balance -= amount;
                System.out.println(threadName + " successfully withdrew $" + amount);
            } else {
                System.out.println(threadName + " failed to withdraw. Insufficient funds.");
            }
        }
    }

    public int getBalance() {
        return balance;
    }
}