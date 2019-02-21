package book2.chap13.src0701;

public interface Storage<T> {
    public void add(T item, int index);
    public T get(int index);
}
