package book1.chap07;

public class PhoneExample {
    public static void main(String[] args) {
        // Phone phone = new Phone();

        SmartPhone smartPhone = new SmartPhone("홍길동");

        // Phone 의 메소드
        smartPhone.turnOn();
        // SmartPhone 의 메소드
        smartPhone.internetSearch();
        // Phone 의 메소드
        smartPhone.turnOff();
    }
}
