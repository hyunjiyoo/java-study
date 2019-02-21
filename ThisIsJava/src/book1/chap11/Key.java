package book1.chap11;

// hashCode() 메소드를 재정의하지 않음
public class Key {
    public int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Key) {
            Key compareKey = (Key) obj;
            if(this.number == compareKey.number) {
                return true;
            }
        }
        return false;
    }

    // "홍길동"을 읽으려면 다음과 같이 재정의한 hashCode() 메소드를 Key클래스에 추가.
    @Override
    public int hashCode() {
        return number;
    }
}