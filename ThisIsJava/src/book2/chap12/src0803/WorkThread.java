package book2.chap12.src0803;

// InterruptedException이 발생할 때 스레드가 종료되도록 함
public class WorkThread extends Thread {
    // 스레드 그룹과 이름 설정
    public WorkThread(ThreadGroup threadGroup, String threadName) {
        super(threadGroup, threadName);
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // InterruptedException 발생될때, while문 빠져나와 스레드 종료시킴.
                System.out.println(getName() + " interrupted");
                break;
            }
        }
        System.out.println(getName() + " 종료됨");
    }
}
