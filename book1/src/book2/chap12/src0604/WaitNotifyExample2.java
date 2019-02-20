package book2.chap12.src0604;

public class WaitNotifyExample2 {
    public static void main(String[] args) {
        DataBox dataBox = new DataBox();

        ProductThread productThread = new ProductThread(dataBox);
        ConsumerThread consumerThread = new ConsumerThread(dataBox);

        productThread.start();
        consumerThread.start();
    }
}
