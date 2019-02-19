package book1.chap06;

public class Printer {

    // 오버로딩!!
    static void println(int value) {
        System.out.println(value);
    }

    static void println(boolean value) {
        System.out.println(value);
    }

    static void println(double value) {
        System.out.println(value);
    }

    static void println(String value) {
        System.out.println(value);
    }
}
