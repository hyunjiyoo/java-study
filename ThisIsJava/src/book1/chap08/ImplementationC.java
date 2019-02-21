package book1.chap08;
// Interface C 의 구현 클래스
public class ImplementationC implements InterfaceC{

    // InterfaceA와 InterfaceB의 실체메소드도 있어야 함.
    public void methodA() {
        System.out.println("ImplementationC-methodA() 실행");
    }
    public void methodB() {
        System.out.println("ImplementationC-methodB() 실행");
    }
    public void methodC() {
        System.out.println("ImplementationC-methodC() 실행");
    }
}
