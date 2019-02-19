package book2.chap12.scr0201;

// 메인스레드와 작업스레드가 동시에 발생
public class BeepPrintExample2 {
    // 메인스레드
    public static void main(String[] args) {
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        // 작업스레드 Run
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
