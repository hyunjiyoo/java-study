package book1.chap08;
// 매개변수의 인터페이스화
public class Driver {
    public void drive(Vehicle vehicle) {

        // vehicle 매개변수가 참조하는 객체가 Bus 인지 조사
        if (vehicle instanceof Bus) {
            // Bus 객체일 경우 안전하게 강제 타입 변환.
            Bus bus = (Bus) vehicle;
            // Bus 객체의 checkFare() 메소드를 사용하기위해 강제타입변환 함.
            bus.checkFare();
        }

        vehicle.run();
    }
}
