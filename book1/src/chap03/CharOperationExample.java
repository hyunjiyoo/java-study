package chap03;

public class CharOperationExample {
	public static void main(String[] args) {
		
		// 'A'�� 65��� �����ڵ�� ��ȯ�Ǵµ� 66�� charŸ�Կ� �����ϸ� 'B'�� ����.
		// �ڹٴ� ���ͷ� ���� ������ Ÿ�� ��ȯ ���� �ش� Ÿ������ ���.
		char c1 = 'A' + 1;
		char c2 = 'A';
		
		// c2�� ���⼭ intŸ������ ��ȯ�ǰ��� 1�� ����Ǳ� ������ ����Ÿ���� intŸ���� �ȴ�.
		// ���� intŸ���� charŸ�Կ� �����Ϸ��� �ϱ⶧���� �����Ͽ��� �߻�!!
		// char c3 = c2 + 1; // ������ ����
		char c3 = (char) (c2 + 1); // ���� 
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
	}
}