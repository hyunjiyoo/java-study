package book2.chap14.src0401;

public class UsingThisExample {
    public static void main(String ... args) {
        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = usingThis.new Inner();
        inner.method();
    }
}
