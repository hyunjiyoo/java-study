package chap11;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        // 매개값이 Member2 타입인지 확인
        if(obj instanceof chap11.Member2) {
            // Member2 타입으로 강제 타입변환
            chap11.Member2 member = (chap11.Member2) obj;
            // id 필드값이 동일한지 검사 후, 동일하면 true 리턴
            if (id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        // id가 동일한 문자열인 경우 같은 해시코드를 리턴
        return id.hashCode();
    }
}
