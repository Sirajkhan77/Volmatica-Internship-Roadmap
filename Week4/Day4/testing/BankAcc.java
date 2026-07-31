package Week4.Day4.testing;

public class BankAcc {
    private  volatile  int bal;

    public BankAcc(int bal) {
        this.bal = bal;
    }
    public void withdraw(int amt){
        String name = Thread.currentThread().getName();
        System.out.println(name+ " is checking balance now..");
        synchronized (this){
            if (bal>=amt){
                System.out.println("/n Yes the balance is enough..");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {}
                bal-=amt;
                System.out.println("Withdraw of  "+ amt+" is done ");
                System.out.println("Current Available balance: "+bal);
            }else {
                System.out.println("the amount is greater then current balance");
            }
        }
    }
}
