package chap07;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly(); // super.fly() 호출
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly(); // override된 fly() 호출
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly(); // super.fly() 호출
        sa.land();
    }
}
