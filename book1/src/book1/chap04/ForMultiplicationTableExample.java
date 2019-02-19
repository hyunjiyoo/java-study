package book1.chap04;

public class ForMultiplicationTableExample {
	// 구구단 출력하기
	public static void main(String[] args) {
		int result = 0;
		
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				result = i * j;
				System.out.println(i + " * " + j + " = " + result);
			}
			System.out.println();
		}
	}
}