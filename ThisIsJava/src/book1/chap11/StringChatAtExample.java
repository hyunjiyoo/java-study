package book1.chap11;

public class StringChatAtExample {
    public static void main(String[] args) {
        String ssn = "010624-1230123";
        // ssn의 7번째 인덱스 읽어 여자와 남자 구별
        char sex = ssn.charAt(7);

        switch (sex) {
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여자 입니다.");
                break;
        }
    }
}
