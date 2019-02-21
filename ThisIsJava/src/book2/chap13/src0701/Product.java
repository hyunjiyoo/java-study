package book2.chap13.src0701;

public class Product<T,M> {
    private T kind;
    private M model;

    public T getKind() {
        return this.kind;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
