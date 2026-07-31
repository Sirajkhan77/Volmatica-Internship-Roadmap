package Week4.Day4.testing;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAcc bankAcc = new BankAcc(200);
        Thread t1 = new Thread(new MyThread(120, bankAcc), "userSiraj");
        Thread t2 = new Thread(new MyThread(70, bankAcc), "userAmir");
        Thread t3 = new Thread(new MyThread(400, bankAcc), "userBajwa");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }
}
