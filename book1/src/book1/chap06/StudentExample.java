package book1.chap06;

public class StudentExample {
    public static void main(String[] args) {
        // new 연산자는 힙영역에 객체 생성시킨 후, 객체의 주소를 리턴.
        Student s1 = new Student(); // ex. 100번지의 Student 객체 참조.
        System.out.println("s1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student(); // ex. 200번지의 Student 객체 참조.
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
    }
}
