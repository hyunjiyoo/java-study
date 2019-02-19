package book2.chap12.src0202;

import java.awt.*;

// 비프음을 들려주는 스레드
public class BeepThread extends Thread {
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
