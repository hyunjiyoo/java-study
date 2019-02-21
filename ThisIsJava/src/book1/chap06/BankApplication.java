package book1.chap06;

import java.util.Scanner;

public class BankApplication {
    private static BankAccount[] accountArray = new BankAccount[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3. 예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택: ");

            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    // 계좌 생성하기
    private static void createAccount() {
        System.out.println("------");
        System.out.println("계좌생성");
        System.out.println("------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.println("계좌주");
        String owner = scanner.next();
        System.out.println("초기입금액: ");
        int balance = scanner.nextInt();

        BankAccount newAccount = new BankAccount(ano, owner, balance);
        for (int i=0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    // 계좌 목록보기
    private static void accountList() {
        System.out.println("------");
        System.out.println("계좌목록");
        System.out.println("------");

        for (int i=0; i < accountArray.length; i++) {
            BankAccount bankAccount = accountArray[i];
            if (bankAccount != null) {
                System.out.print(bankAccount.getAno());
                System.out.print("      ");
                System.out.print(bankAccount.getOwner());
                System.out.print("      ");
                System.out.print(bankAccount.getBalance());
                System.out.println();
            }
        }
    }

    // 예금하기
    private static void deposit() {
        System.out.println("------");
        System.out.println("예금");
        System.out.println("------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int money = scanner.nextInt();
        BankAccount bankAccount = findAccount(ano);
        if (bankAccount == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        bankAccount.setBalance(bankAccount.getBalance() + money);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    // 출금하기
    private static void withdraw() {
        System.out.println("------");
        System.out.println("출금");
        System.out.println("------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int money = scanner.nextInt();
        BankAccount bankAccount = findAccount(ano);
        if (bankAccount == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        bankAccount.setBalance(bankAccount.getBalance() - money);
        System.out.println("결과: 출금이 성공되었습니다.");

    }

    // Account 배열에서 ano와 동일한 Account 객체 찾기
    private static BankAccount findAccount(String ano) {
        BankAccount bankAccount = null;
        for (int i=0; i < accountArray.length; i++){
            if (accountArray[i] != null) {
                String dbAno = accountArray[i].getAno();
                if (dbAno.equals(ano)) {
                    bankAccount = accountArray[i];
                    break;
                }
            }
        }
        return bankAccount;
    }
}
