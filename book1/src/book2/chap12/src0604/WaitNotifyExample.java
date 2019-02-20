package book2.chap12.src0604;

public class WaitNotifyExample {
    public static void main(String[] args) {
        // 공유 객체 생성
        WorkObject sharedObject = new WorkObject();

        ThreadA threadA = new ThreadA(sharedObject);
        ThreadB threadB = new ThreadB(sharedObject);

        threadA.start();
        threadB.start();
    }
}
