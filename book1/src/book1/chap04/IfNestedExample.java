package book1.chap04;

public class IfNestedExample {
	// 81<=...<=100 사이에 속하는 점수를 뽑아내어 A+,A,B+,B를 출력한다.
	public static void main(String[] args) {
		/* 
		 * 먼저 0~19 사이의 난수를 생성해서 81을 더해준다.
		 * 그러면 (0+81)~(19+81)인 81~100사이의 난수가 생성된다.
		 */
		int score = (int)(Math.random()*20) + 81;
		System.out.println(score);
		
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("A+입니다.");
			} else {
				System.out.println("A 입니다.");
			}
		} else {
			if (score >= 85) {
				System.out.println("B+ 입니다.");
			} else {
				System.out.println("B 입니다.");
			}
		} 
	}
}