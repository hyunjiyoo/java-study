package chap04;

public class IfNestedExample {
	// 81<=...<=100 ���̿� ���ϴ� ������ �̾Ƴ��� A+,A,B+,B�� ����Ѵ�.
	public static void main(String[] args) {
		/* 
		 * ���� 0~19 ������ ������ �����ؼ� 81�� �����ش�.
		 * �׷��� (0+81)~(19+81)�� 81~100������ ������ �����ȴ�.
		 */
		int score = (int)(Math.random()*20) + 81;
		System.out.println(score);
		
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("A+�Դϴ�.");
			} else {
				System.out.println("A �Դϴ�.");
			}
		} else {
			if (score >= 85) {
				System.out.println("B+ �Դϴ�.");
			} else {
				System.out.println("B �Դϴ�.");
			}
		} 
	}
}