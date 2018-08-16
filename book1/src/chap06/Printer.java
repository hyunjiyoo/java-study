package chap06;

public class Printer {

    // 오버로딩!!
    void println(int value) {
        System.out.println(value);
    }

    void println(boolean value) {
        System.out.println(value);
    }

    void println(double value) {
        System.out.println(value);
    }

    void println(String value) {
        System.out.println(value);
    }
}
