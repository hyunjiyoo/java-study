package chap05;
// 객체를 참조하는 배열
public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java"); // new 연산자는 주소값 다른 객체를 새로 생성.

        System.out.println(strArray[0] == strArray[1]); // true
        System.out.println(strArray[0] == strArray[2]); // false
        System.out.println(strArray[0].equals(strArray[2])); //true
    }
}
