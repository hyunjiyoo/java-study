package book2.chap12.src0605;

// 1초 후 출력 스레드 중지
// interrupt() 메소드는 스레드가 일시정지 상태에 있을 때 InterrutedException 예외 발생
public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread2();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 스레드 종료시키기 위해 InterruptedException 발생
        // 즉시 발생시키는 것이 아닌 미래에 일시정지 상태가 되면 예외 발생
        thread.interrupt();
    }
}
