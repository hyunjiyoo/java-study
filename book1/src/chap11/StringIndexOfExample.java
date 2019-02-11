package chap11;

public class StringIndexOfExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        // 주어진 문자열이 시작되는 인덱스 리턴
        int location = subject.indexOf("프로그래밍");
        System.out.println(location);

        // 찾는문자열 조건
        if (subject.indexOf("자바") != -1) {
            // 포함되어 있는 경우
            System.out.println("자바와 관련된 책이군요");
        } else {
            // 포함되어 있지 않은 경우
            System.out.println("자바와 관련없는 책이군요");
        }
    }
}
