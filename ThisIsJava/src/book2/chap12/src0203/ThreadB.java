package book2.chap12.src0203;

public class ThreadB extends Thread{
    public void run() {
        // ThreadB 실행 내용
        for (int i = 0; i < 2; i++) {
            // 스레드 이름 얻기
            System.out.println(getName() + "가 출력한 내용");
        }
    }
}
