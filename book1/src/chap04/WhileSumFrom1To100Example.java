package chap04;

public class WhileSumFrom1To100Example {
	// 1부터 100까지 합을 출력
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num<=100) {
			sum += num;
			num++;
		}
		System.out.println(sum);
	}
}
