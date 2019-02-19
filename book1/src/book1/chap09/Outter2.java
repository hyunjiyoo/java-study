package book1.chap09;

public class Outter2 {
    String field = "Outter-field";
    void method() {
        System.out.println("Outter-method");
    }

    class Nested {
        String field = "Nested-field";
        void method() {
            System.out.println("Nested-method");
        }
        void print() {
            // 중첩객체 참조
            System.out.println(this.field);
            this.method();
            // 바깥객체 참조
            System.out.println(Outter2.this.field);
            Outter2.this.method();
        }
    }
}
