package book2.chap12.src0601;

public class ThreadA extends Thread {
    public boolean stop = false; // 종료 플래그
    public boolean work = true; // 작업 진행 여부 플래그

    public void run() {
        // stop이 true되면 while문 종료
        while (!stop) {
            if (work) {
                System.out.println("ThreadA 작업 내용");
            } else {
                // work가 false되면 다른 스레드에게 실행 양보
                Thread.yield();
            }
        }
        System.out.println("ThreadA 종료");
    }
}
