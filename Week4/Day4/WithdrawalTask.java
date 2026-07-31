package Week4.Day4;
// Runnable used for task separation
class WithdrawalTask implements Runnable {
//    private BankAccount account;
//    private int amount;
//    private boolean useSafeMethod;
//
//    public WithdrawalTask(BankAccount account, int amount, boolean useSafeMethod) {
//        this.account = account;
//        this.amount = amount;
//        this.useSafeMethod = useSafeMethod;
//    }

//    @Override
//    public void run() {
//        if (useSafeMethod) {
//            account.withdrawSafe(amount);
//        } else {
//            account.withdrawUnsafe(amount);
//        }
//    }

    private  BankAccount account;
    private int amount;
    private  boolean checkIfSafe;

    public WithdrawalTask(BankAccount account, int amount, boolean checkIfSafe) {
        this.account = account;
        this.amount = amount;
        this.checkIfSafe = checkIfSafe;
    }

    @Override
    public void run(){
        if (checkIfSafe){
            account.withdrawSafe(amount);
        }else {
            account.withdrawUnsafe(amount);
        }
    }
}
