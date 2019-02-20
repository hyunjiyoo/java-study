package book2.chap12.src0604;

// 데이터를 생산(저장)하는 스레드
public class ProductThread extends Thread {
    private DataBox dataBox;

    public ProductThread(DataBox dataBox) {
        // 공유객체를 필드에 저장
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            String data = "Data-" + i;
            // 새로운 데이터를 저장
            dataBox.setData(data);
        }
    }
}
