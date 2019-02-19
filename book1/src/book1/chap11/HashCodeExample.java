package book1.chap11;

import java.util.Objects;

// Objects.hash(Object ... values) 메소드는 매개값으로 주어진 값들을 이용해서 해시코드 생성
public class HashCodeExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");
        System.out.println(s1.hashCode()); // 54151054
        System.out.println(Objects.hashCode(s2)); // 54151054
    }

    static class Student {
        int sno;
        String name;
        Student(int sno, String name) {
            this.sno = sno;
            this.name = name;
        }

        @Override
        // 해시코드를 재정의함으로써, sno와 name만 같으면 같은 hashCode 리턴.
        public int hashCode() {
            return Objects.hash(sno, name);
        }
    }
}
