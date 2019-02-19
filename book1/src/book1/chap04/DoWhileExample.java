package book1.chap04;

import java.util.Scanner;

public class DoWhileExample {
	// do-while문 사용
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		// Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		// String 클래스객체 선언.
		String inputString;
		
		do {
			System.out.print(">");
			// 키보드로 입력한 문자열을 얻음
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료!!");
		

	}

}
