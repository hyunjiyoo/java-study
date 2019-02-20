package book2.chap12.src0603;

// 다른 스레드가 종료될 때까지 일시 정지 상태 유지
public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            // sumThread 종료할 때까지 메인스레드 일시정지
            sumThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1~100 합: " + sumThread.getSum());
    }
}
