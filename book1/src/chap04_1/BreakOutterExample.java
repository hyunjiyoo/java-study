package chap04_1;

/* 바깥쪽 반복문 종료
*  반복문이 중첩되어 있을 경우 break문은 가장 가까운 반복문만 종료하고 바깥쪽 반복문은 종료시키지 않는다.
*  중첩반복문에서 바깥쪽 반복문까지 종료시키려면 바깥쪽 반복문에 이름(라벨)을 붙이고 "break 이름:"을 사용하면 된다.
*  */

public class BreakOutterExample {
    public static void main(String[] args) {
        Outter: for (char upper='A'; upper <= 'Z'; upper++) {
            for (char lower='a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                if(lower == 'g') {
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 실행 종료");
    }
}
