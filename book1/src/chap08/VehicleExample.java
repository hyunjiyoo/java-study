package chap08;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare(); (X)
        // Vehicle 인터페이스에는 checkFare() 가 없음

        // 강제 타입 변환
        Bus bus = (Bus) vehicle;

        bus.run();
        // Bus 클래스에는 checkFare() 가 있음.
        bus.checkFare();
    }
}
