package chap04;

public class IfNestedExample_2 {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;
		System.out.println(score);

		// 성적담을 변수 생성.
		String grade;

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}

		System.out.println(grade);
	}
}