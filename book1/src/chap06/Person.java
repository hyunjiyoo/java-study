package chap06;
/*
final 필드는 초기값이 저장되면 이것이 최종값이 되어 수정 불가.
초기값주는 방법 : 1. 필드 선언시(단순값) 2. 생성자(복잡한 초기화 코드)
(초기화 되지 않은 final 필드 그냥 두면 컴파일 에러발생)
 */
public class Person {
    final String nation = "Korea"; // 단순 초기화
    final String ssn;
    String name;

    // 객체 생성되고 나서 매개변수 값 받아서 final 변수 초기화.
    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
