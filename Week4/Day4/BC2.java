package Week4.Day4;

public class BC2 {
    private volatile int balance;

    public BC2(int balance) {
        this.balance = balance;
    }

    public void unsafeWithdraw(int amt){
//        Thread t= new Thread();
        String tName = Thread.currentThread().getName();
        System.out.println(tName+"is checking bal");
        if(balance>=amt){
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){}
            balance-=amt;
            System.out.println("done ");
        }else {
            System.out.println("fail..");
        }
//        return balance;
    }

    public  void  safeWithdraw(int amtt){
        String name =  Thread.currentThread().getName();
        System.out.println(name+" is checking the balance.. ");
        synchronized (this){
            if (balance>=amtt){
                System.out.println("available balaneeeeeee");
                try{
                    Thread.sleep(50);
                }catch (InterruptedException e){}
                balance-=amtt;
                //done withdrwaw..
                System.out.println("");

            }else {
                System.out.println("Not enough bal");
            }

        }
    }

}
