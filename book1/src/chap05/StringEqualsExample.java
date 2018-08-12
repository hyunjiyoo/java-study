package chap05;

public class StringEqualsExample {
    public static void main(String[] args) {
        // 1.힙영역에서 같은 객체 참조 (자바의 특성)
        String strVar1 = "신민철";
        String strVar2 = "신민철";
        // 주소값 비교
        if (strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음"); // ok
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }
        // value값 비교
        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        // 2.힙영역에 있는 서로 다른 객체 생성
        String strVar3 = new String("신민철");
        String strVar4 = new String("신민철");
        // 주소값 비교
        if (strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름"); // ok
        }

        if (strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }
    }
}
