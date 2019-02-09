package chap06_1;

public class MemberExample {
    public static void main(String[] args) {
        Member member = new Member();

        boolean result = member.login("hong", "12345");
        if (result) {
            System.out.println("로그인되었습니다.");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
