package Week4.Day3;


public class Main {

    public static void main(String[] args) {

        System.out.println("Program Started");

        System.out.println(Thread.currentThread().getName());

        MyThread t = new MyThread();
        PrintNumbers s = new PrintNumbers();

//        t.start();
//        s.start();
//        s.start
        System.out.println("Main Thread");

        System.out.println("Program Ended");




    }

}
