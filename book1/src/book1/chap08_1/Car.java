package book1.chap08_1;

public class Car {
    // 인터페이스 타입 필드 선언과 초기 구현 객체 대입
    Tire[] tires = {
            new HankookTire(),
            new HankookTire(),
            new HankookTire(),
            new HankookTire()
    };

    void run() {
        // 인터페이스에서 설명된 roll() 메소드 호출
        for (Tire tire : tires) {
            tire.roll();
        }
    }
}
