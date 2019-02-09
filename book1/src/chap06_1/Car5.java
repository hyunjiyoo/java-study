package chap06_1;

public class Car5 {
    // 필드는 private으로 외부에서 접근 막도록 설정
    private int speed;
    private boolean stop;

    // 생성자

    // 메소드에서 필드 접근할 수 있게 public 설정
    public int getSpeed() {
        return speed;
    }
    // speed 필드 가공해서 return 해줌
    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }
    // get메소드는 is 또는 get으로 씀.
    public boolean isStop() {
        return stop;
    }
    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }
}
