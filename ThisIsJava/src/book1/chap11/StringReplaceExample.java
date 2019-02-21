package book1.chap11;

public class StringReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
        String newStr = oldStr.replace("자바", "JAVA");
        System.out.println(oldStr); // 자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.
        System.out.println(newStr); // JAVA는 객체지향언어 입니다. JAVA는 풍부한 API를 지원합니다.
    }
}
