package chap08;

public class Car {
    // 인터페이스 타입 필드 선언과 초기 구현 객체 대입
    Tire frontLeftTire = new HankookTire();
    Tire frontRightTire = new HankookTire();
    Tire backLeftTire = new HankookTire();
    Tire backRightTire = new HankookTire();

    /* 인터페이스 배열
    Tire[] tires = {
        new HankookTire();
        new HankookTire();
        new HankookTire();
        new HankookTire();
    };
     */

    // 인터페이스에서 설명된 roll() 메소드 호출
    void run() {
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }

    /*  roll() 메서드 배열의 인덱스로 호출.
    void run() {
        for(Tire tire : tires) {
            tire.roll();
        }
    }
     */
}
