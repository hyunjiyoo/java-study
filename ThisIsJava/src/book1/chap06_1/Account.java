package book1.chap06_1;

public class Account {

    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (MIN_BALANCE > balance || balance > MAX_BALANCE ) {
            // 현재 값 유지
            return;
        } else {
            this.balance = balance;
        }
    }
}
