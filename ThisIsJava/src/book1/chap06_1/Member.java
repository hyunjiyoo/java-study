package book1.chap06_1;

public class Member {
    String id;
    String password;

    Member() {}
    Member(String id) {
        this.id = id;
    }
    Member(String id, String password) {
        this(id);
        this.password = password;
    }

    public boolean login (String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
            return true;
        } else {
            return false;
        }
    }

    public void logout (String id) {
        System.out.println("로그아웃 되었습니다.");
    }
}
