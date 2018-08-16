package chap06;

public class Account {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    private int balance; // 잔고

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        // balance 범위값 설정.
        if ((balance < MIN_BALANCE) || (balance > MAX_BALANCE)) {
            return;
        } else {
            this.balance = balance;
        }
    }
}
