package book2.chap12.scr0201;

import java.awt.*;

// 메인 스레드만 이용한 경우
public class BeepPrintExample1 {
    public static void main(String[] args) {
        // Toolkit 객체 얻기
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            // 비프음 발생
            toolkit.beep();
            try {
                // 0.5초간 일시 정지
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

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
