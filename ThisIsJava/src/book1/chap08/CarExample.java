package book1.chap08;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        // 한국타이어를 금호타이어로 교체
        myCar.frontLeftTire = new KumhoTire();
        myCar.frontRightTire = new KumhoTire();
        // myCar.tires[0] = new KumhoTire();
        // myCar.tires[1] = new KumhoTire();

        myCar.run();
    }
}
