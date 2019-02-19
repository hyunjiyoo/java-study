package book2.chap12.src0202;

public class BeepPrintExample3 {
    // 메인스레드
    public static void main(String[] args) {
        // BeepThread 객체 만들어 start()메소드로 run()메소드 실행.
        Thread thread = new BeepThread();
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
