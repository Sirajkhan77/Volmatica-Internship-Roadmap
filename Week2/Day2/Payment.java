package Week2.Day2;

interface Payment {
    void pay(double amount);
}
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid using Credit Card");
    }
}
class JazzCash implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid using JazzCash");
    }
}