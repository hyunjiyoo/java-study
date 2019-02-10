package chap09;

public class Outter {
    // 자바 7 이전
    // 반드시 final 키워드를 매개변수에 명시!!
    public void method1 (final int arg) {
        final int localVariable = 1;
        // arg = 100; (X)
        // localVariable = 100; (X)
        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
    }

    // 자바 8 이후
    // final 키워드 없어도 final 특성 가짐
    public void method2 (int arg) {
        int localVariable = 1;
        // arg = 100; (X)
        // localVariable = 100; (X)
        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
    }

}
