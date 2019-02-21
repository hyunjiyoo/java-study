package book1.chap10;

/*
ArrayIndexOutOfBoundsException 발생!!
두 개의 실행 매개값을 주지 않았기 때문.
 */
public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        String data1 = args[0];
        String data2 = args[1];

        System.out.println("args[0]: " + data1);
        System.out.println("args[1]: " + data2);
    }
}
