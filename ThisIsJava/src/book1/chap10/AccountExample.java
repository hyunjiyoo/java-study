package book1.chap10;

// 사용자 정의 예외 발생시키기
public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        // 예금하기
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        // 출금하기
        try {
            account.withdraw(30000);
        } catch (BalanceInsufficientException e) {
            // 예외 메세지 얻기
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            // 예외 추적후 출력
            e.printStackTrace();
        }
    }
}
