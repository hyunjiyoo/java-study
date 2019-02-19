package book1.chap08_1;

public class RemoteControllerExample {
    public static void main(String[] args) {
        RemoteControl rc = null;
        rc = new Television();
        rc.turnOn(); // Television.turnOn();
        rc.setMute(true); // 구현객체의 디폴트메소드 실행
        rc.turnOff(); // Television.turnOff();

        rc = new Audio();
        rc.turnOn(); // Audio.turnOn();
        rc.setMute(true); // Override한 Audio.setMute() 실행
        rc.turnOff(); // Audio.turnOff();
    }
}
