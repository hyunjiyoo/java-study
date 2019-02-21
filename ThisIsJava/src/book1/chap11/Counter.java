package book1.chap11;
/*
쓰레기 수집기는 객체를 소멸하기 직전에 마지막으로 객체의 소멸자(finalize())를 실행시킨다.
만약, 객체가 소멸되기 전에 마지막으로 사용했던 자원(데이터 연결, 파일 등)을 닫고 싶거나, 중요한 데이터를 저장하고 싶다면 finalize() 재정의.
*/
public class Counter {
    private int no;

    public Counter(int no) {
        this.no = no;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(no + "번 객체의 finalize()가 실행됨.");
    }
}
