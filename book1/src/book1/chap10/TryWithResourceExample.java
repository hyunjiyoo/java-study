package book1.chap10;

// try 블록이 정상 실행완료했거나 도중에 예외발생하면 자동으로 FileInputStream의 close() 메소드가 호출됨.
// try {} 에서 예외발생하면 우선 close()로 리소스 닫고 catch 블록 실행.
public class TryWithResourceExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file.txt")) {
            fis.read();
            throw new Exception();
        } catch (Exception e) {
            System.out.println("예외 처리 코드가 실행되었습니다.");
        }
    }
}
