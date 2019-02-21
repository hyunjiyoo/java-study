package book2.chap14.src0501;

public class RunnableExample {
    public static void main(String[] args) {
        // Runnable 인터페이스는 매개변수와 리턴값이 없는 run() 메소드만 존재하기 때문에 람다식 가능
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
