package book1.chap08;
// 인터페이스 변수에 구현 객체 대입
public class RemoteControllerExample {
    public static void main(String[] args) {
        // 인터페이스 변수
        RemoteControl rc;
        // 구현객체를 변수에 대입
        rc = new Television();
        rc = new Audio();

        // 익명 구현 클래스
        // 인터페이스에 선언된 모든 추상 메소드들의 실체 메소드를 작성해야함.
        RemoteControl remoteControl = new RemoteControl() {
            @Override
            public void turnOn() {
            }
            @Override
            public void turnOff() {
            }
            @Override
            public void setVolume(int volume) {
            }
        };
    }
}
