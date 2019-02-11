package chap11;

import java.util.Objects;

// Null 여부 조사
// 첫번째 매개값이 not null 이면 첫번째 매개값을 리턴하고, null이면 모두 NullPointerException 발생.
public class NullExample {
    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = null;

        System.out.println(Objects.requireNonNull(str1)); // 홍길동

        try {
            String name = Objects.requireNonNull(str2);
        } catch (Exception e) {
            System.out.println(e.getMessage()); // null
        }

        try {
            String name = Objects.requireNonNull(str2, "이름이 없습니다."); // "이름이 없습니다."
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            String name = Objects.requireNonNull(str2, () -> "이름이 없다니깐요"); // "이름이 없다니깐요"
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
