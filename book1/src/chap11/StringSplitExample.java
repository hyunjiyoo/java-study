package chap11;

public class StringSplitExample {
    public static void main(String[] args) {
        String text = "홍길동&이수홍,박연수,김자바-최명호";

        // & , - 를 |기호로 연결한 정규표현식을 매개값으로 제공하면 split() 메소드는 이 기호들을 구분자로 문자열 추출.
        String[] names = text.split("&|,|-");

        for(String name : names) {
            System.out.println(name);
        }
    }
}
