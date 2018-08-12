package chap04;

public class IfDiceExample {
	// 주사위의 번호를 뽑는 예제
	public static void main(String[] args) {
		/*
		 * Math.random()은 double타입의 값을 0.0~1.0 까지 난수를 리턴한다.
		 * 따라서 int타입으로 형변환 시켜주어야 하고, 
		 * 1~6 까지의 난수를 리턴하게 하려면, Math.random()*6 을 하고나서 +1을 해주어야한다.
		 * Math.random()은 0~5까지를 반환하기 때문이다.
		 */
		int num = (int)(Math.random()*6) + 1;
		
		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else if (num == 6) {
			System.out.println("6번이 나왔습니다.");
		}

	}

}
