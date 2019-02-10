package chap09;

public class AnonymousExample2 {
    public static void main(String[] args) {
        Anonymous2 anony2 = new Anonymous2();
        // 익명 객체 필드 사용
        anony2.field.turnOn();
        // 익명 객체 로컬 변수 사용
        anony2.method1();
        // 익명 객체 매개값 사용
        anony2.method2(
                new RemoteControl() {
                    @Override
                    public void turnOn() {
                        System.out.println("Smart TV를 켭니다.");
                    }

                    @Override
                    public void turnOff() {
                        System.out.println("Smart TV를 끕니다.");
                    }
                }
        );
    }
}
