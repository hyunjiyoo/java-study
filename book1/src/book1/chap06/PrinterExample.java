package book1.chap06;

public class PrinterExample {
    public static void main(String[] args) {
        //Printer printer = new Printer();
        // 만일 객체를 생성하지 않고, 클래스 메소드에 접근하려면, static 정적매소드 사용!!
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
    }
}
