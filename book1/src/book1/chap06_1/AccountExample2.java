package book1.chap06_1;

import java.util.Scanner;

public class AccountExample2 {
    private static Account2[] accountArray = new Account2[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("-----------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-----------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();
            switch (selectNo) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void createAccount() {
        System.out.println("-----------");
        System.out.println("계좌생성");
        System.out.println("-----------");

        System.out.print("계좌번호: ");
        String inputAno = scanner.next();
        System.out.print("계좌주: ");
        String inputName = scanner.next();
        System.out.print("초기입금액: ");
        int inputBalance = scanner.nextInt();

        Account2 newAccount = new Account2(inputAno, inputName, inputBalance);
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    private static void accountList() {
        System.out.println("-----------");
        System.out.println("계좌목록");
        System.out.println("-----------");
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                System.out.println(accountArray[i].getAno() +  "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
            }
        }
    }

    private static void deposit() {
        System.out.println("-----------");
        System.out.println("예금");
        System.out.println("-----------");

        System.out.print("계좌번호 : ");
        String inputAno = scanner.next();
        if (findAccount(inputAno) != null) {
            System.out.print("예금액 : ");
            int inputDeposit = scanner.nextInt();

            findAccount(inputAno).setBalance(findAccount(inputAno).getBalance() + inputDeposit);
            System.out.println("결과: 예금이 성공되었습니다.");
        }
    }

    private static void withdraw() {
        System.out.println("-----------");
        System.out.println("출금");
        System.out.println("-----------");

        System.out.print("계좌번호 : ");
        String inputAno = scanner.next();
        if (findAccount(inputAno) != null) {
            System.out.print("출금액 : ");
            int withDrawalMoney = scanner.nextInt();
            findAccount(inputAno).setBalance(findAccount(inputAno).getBalance() - withDrawalMoney);
            System.out.println("결과: 출금이 성공되었습니다.");
        }
    }

    // Account 배열에서 ano와 동일한 Account 객체 찾기
    private static Account2 findAccount(String ano) {
        for (Account2 account2 : accountArray) {
            if(account2 != null) {
                if (account2.getAno().equals(ano)) {
                    return account2;
                }
            }
        }
        return null;
    }
}