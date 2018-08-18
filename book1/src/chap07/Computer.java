package chap07;
/*
< 메소드 오버라이딩 >
- 부모의 메소드와 동일한 시그너처(리턴타임, 메소드 이름, 매개변수 리스트)를 가져야함.
- 접근제한 더 강하게 오버라이딩할 수 없다.
    (만일 부모가 public 접근 제한 가지고 있으면, 자식 메소드는 default나 private 으로 수정할 수 없다.)
    (부모가 default 일때, 자식은 public이나 default만 가능.)
- 새로운 예외(Exception)를 throws할 수 없다.
 */
public class Computer extends Calculator{
    @Override
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
