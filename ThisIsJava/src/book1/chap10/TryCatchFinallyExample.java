package book1.chap10;

// 일반 예외 처리:
public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            // Class.forNamne() 메소드는 매개값으로 주어진 클래스 존재하면 Class객체 리턴하지만 존재하지 않으면 ClassNotFoundException 예외 발생
            Class clazz = Class.forName("java.lang.String2");
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }
}
