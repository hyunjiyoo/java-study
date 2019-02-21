package book1.chap04_1;

/* continue문 : 반복문을 종료하지 않고 계속 반복 수행
*  특정조건 만족하는 경우 continue문 실행해서 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어감.
*/

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // 홀수이면 println으로 넘어가지 않고 반복문 실행.
            if (i%2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
