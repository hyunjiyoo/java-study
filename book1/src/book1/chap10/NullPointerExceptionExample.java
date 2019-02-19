package book1.chap10;

// data변수가 null값을 가지고 있기 때문에 String객체를 참조하고 있지 않다.
// 그래서 NullPointerException 발생!!
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String data = null;
        System.out.println(data.toString());
    }
}
