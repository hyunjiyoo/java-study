package book2.chap13.ex04;

public class Util {
    public static <K, V> V getValue(Pair<K, V> p, K k) {
        if (p.getKey().equals(k)) {
            return p.getValue();
        } else {
            return null;
        }
    }
}
