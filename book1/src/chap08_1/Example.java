package chap08_1;

public class Example {
    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        // InterfaceA는 methodA()만 호출 가능
        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        // InterfaceB methodB()만 호출 가능
        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        // InterfaceC methodA,B,C() 모두 호출 가능
        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
