package Week4.Day4.testing;

public class MyThread implements Runnable{
    private  int amt;
    private  BankAcc acc;

    public MyThread(int amt, BankAcc acc) {
        this.amt = amt;
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.withdraw(amt);
    }
}
