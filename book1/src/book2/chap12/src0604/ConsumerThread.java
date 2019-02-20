package book2.chap12.src0604;

// 데이터를 소비하는(읽는) 스레드
public class ConsumerThread extends Thread {
    private DataBox dataBox;

    public ConsumerThread (DataBox dataBox) {
        // 공유객체를 필드에 저장
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            // 새로운 데이터를 읽음
            String data = dataBox.getData();
        }
    }
}
