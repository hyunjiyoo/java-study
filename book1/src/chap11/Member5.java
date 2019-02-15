package chap11;

public class Member5 {
    private String id;
    private String name;

    public Member5 (String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}
