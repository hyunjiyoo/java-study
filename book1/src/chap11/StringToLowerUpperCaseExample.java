package chap11;

public class StringToLowerUpperCaseExample {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "JAVA Programming";

        // 대소문자 구분하여 문자열 비교
        System.out.println(str1.equals(str2)); // false

        // 소문자로 변경
        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();
        System.out.println(lowerStr1.equals(lowerStr2)); // true

        // 대소문자 구분없이 문자열만 비교
        System.out.println(str1.equalsIgnoreCase(str2)); // true
    }
}
