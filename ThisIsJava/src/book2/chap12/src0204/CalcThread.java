package book2.chap12.src0204;

public class CalcThread extends Thread{
    // 스레드 이름 변경
    public CalcThread(String name) {
        setName(name);
    }

    public void run() {
        // 스레드가 실행할 내용
        for (int i = 0; i < 2000000000; i++) {

        }
        System.out.println(getName());
    }
}
