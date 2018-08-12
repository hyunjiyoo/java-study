package chap04;

import java.util.Scanner;

/*
while문과 Scanner를 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료기능을 제공하는 코드를 작성해보세요.
 */
public class Exercise07 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("-----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.조회 | 4.종료");
            System.out.println("-----------------------------");
            System.out.print("선택: ");

            // 메뉴 num 키보드로부터 받아온다.
            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.print("예금액: ");
                    balance += scanner.nextInt();
                    break;
                case 2:
                    System.out.print("출금액: ");
                    balance -= scanner.nextInt();
                    break;
                case 3:
                    System.out.println("조회: " + balance);
                    break;
                case 4:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료!!");
    }
}
