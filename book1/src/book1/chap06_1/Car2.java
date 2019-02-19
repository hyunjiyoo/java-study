package book1.chap06_1;

public class Car2 {
    // 필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;


    // 생성자 자신을 사용하여 코드의 중복을 줄일 수 있다.
    // 이 때 this() 사용!! (반드시 첫줄에 사용)
    Car2() {

    }

    Car2(String model) {
        this(model, "은색", 250);
    }

    Car2(String model, String color) {
        this(model, color, 250);
    }

    Car2(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
