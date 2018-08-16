package chap06;

public class Car3 {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }
    /*
    정적메소드에서 인스턴스 멤버와 메소드 사용하려면, 객체를 만들어야함.
    그냥 참조하면 컴파일 에러 발생.
    ** 인스턴스 멤버와 메소드는 반드시 객체를 먼저 생성하고 참조변수로 접근해야한다.
     */
    public static void main(String[] args) {
        Car3 myCar = new Car3();
        myCar.speed = 60;
        myCar.run();
    }
}
