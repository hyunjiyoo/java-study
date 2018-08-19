package chap08;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언
        RemoteControl rc = null;

        // 정적 메소드 사용 (인터페이스로 바로 접근)
        RemoteControl.changeBattery();

        // Television 객체를 인터페이스 타입에 대입
        rc = new Television();
        // 인터페이스의 turnOn(), turnOff() 호출
        rc.turnOn();
        rc.turnOff();
        // default 메소드 호출
        rc.setMute(true);

        // Audio 객체를 인터페이스 타입에 대입
        rc = new Audio();
        // 인터페이스의 turnOn(), turnOff() 호출
        rc.turnOn();
        rc.turnOff();
        // Audio 클래스에서 재정의한 setMute() 메소드 호출
        rc.setMute(true);
    }
}
