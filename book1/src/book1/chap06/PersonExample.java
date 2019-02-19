package book1.chap06;

public class PersonExample {
    public static void main(String[] args) {
        // 생성자 만들 때, "ssn" final 필드값 초기화.
        Person p1 = new Person("123456-1234567", "계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        // final 필드값 수정 불가!!
        // p1.nation = "usa";
        // p1.ssn = "654321-7654321";

        // 인스텅스 필드는 수정 가능~
        p1.name = "을지문덕";
    }
}
