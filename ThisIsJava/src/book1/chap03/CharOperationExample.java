package book1.chap03;

public class CharOperationExample {
	public static void main(String[] args) {
		
		// 'A'는 65라는 유니코드로 변환되는데 66을 char타입에 대입하면 'B'가 나옴.
		// 자바는 리터럴 간의 연산은 타입 변환 없이 해당 타입으로 계산.
		char c1 = 'A' + 1;
		char c2 = 'A';
		
		// c2는 여기서 int타입으로 변환되고나서 1과 연산되기 때문에 산출타입은 int타입이 된다.
		// 따라서 int타입을 char타입에 대입하려고 하기때문에 컴파일에러 발생!!
		// char c3 = c2 + 1; // 컴파일 에러
		char c3 = (char) (c2 + 1); // 가능 
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
	}
}