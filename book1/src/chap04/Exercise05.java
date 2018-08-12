package chap04;
// 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y)형태로 출력해보세요.
// 단, x와 y는 10이하 자연수입니다.
public class Exercise05 {
    public static void main(String[] args) {
        for (int x=1; x<=10; x++) {
            for(int y=1; y<=10; y++) {
                int z = (4*x) + (5*y);
                if (z == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }
}
