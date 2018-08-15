package chap06;
/*
인스턴스 필드는 생성자에서 초기화하지만, 정적 필드는 객체 생성 없이도 사용하기때문에 생성자에서 초기화 안됨.
그래서 자바는 정적블록을 제공하여 그곳에서 정적 필드 초기화 작업.
 */
public class Television {
    /*
    company와 model 정적필드값은 선언시 초기값을 주었지만,
    info는 정적블록을 이용했다.
     */
    static String company = "Samsung";
    static String model = "LCD";
    static String info;
    // 정적블록은 클래스가 메로리로 로딩될 때 자동적으로 실행된다.
    static {
        info = company + "-" + model;
    }
}
