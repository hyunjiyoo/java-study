package chap07;

public abstract class Animal {
    public String kind;

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    // 추상메소드 : 선언부만 있고, 중괄호 없는 메소드
    // 하위 클래스가 반드시 실행 내용 채우도록 강요하고 싶은 메소드 있을 경우
    public abstract void sound();
}
