package book1.chap08;
// 인터페이스 상속
public class Example {
    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        // InterfaceA 변수는 methodA() 만 호출가능.
        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        // InterfaceB 변수는 methodB() 만 호출가능
        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        // InterfaceC 변수는 methodA(), methodB(), methodC() 모두 호출가능
        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
