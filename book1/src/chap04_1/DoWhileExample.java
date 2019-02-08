package chap04_1;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메세지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.print(">");
            // 키보드로 입력한 문자열을 읽음.
            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while (! inputString.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
