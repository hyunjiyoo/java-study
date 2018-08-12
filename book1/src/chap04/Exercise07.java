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

        Outter: while(run) {
            System.out.println("-----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.조회 | 4.종료");
            System.out.println("-----------------------------");
            System.out.print("선택: ");

            String num = scanner.next();
            int money = 0;

            switch (num) {
                case "1":
                    System.out.print("예금액: ");
                    balance = scanner.nextInt();
                    money += balance;
                    //System.out.println("예금액: " + money);
                    break;
                case "2":
                    System.out.print("출금액: ");
                    balance = scanner.nextInt();
                    money -= balance;

                    //System.out.println("출금액: " + money);
                    break;
                case "3":
                    System.out.println("조회: " + money);
                    break;
                case "4":
                    System.out.println("프로그램 종료!!");
                    break Outter;
            }

        }
    }
}
