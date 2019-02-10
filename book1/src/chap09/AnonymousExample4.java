package chap09;

public class AnonymousExample4 {
    public static void main(String[] args) {
        Anonymous4 anony4 = new Anonymous4();
        anony4.field.run();
        anony4.method1();
        anony4.method2(
                new Vehicle() {
                    @Override
                    public void run() {
                        System.out.println("트럭이 달립니다.");
                    }
                }
        );
    }
}
