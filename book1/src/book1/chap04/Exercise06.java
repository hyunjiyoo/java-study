package book1.chap04;
// for문을 이용해서 실행결과와 같은 직각 삼각형을 출력하는 코드를 작성해보세요.
public class Exercise06 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=i; j++) {
                String star = "*";
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
