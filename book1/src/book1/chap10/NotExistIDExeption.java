package book1.chap10;

public class NotExistIDExeption extends Exception {
    public NotExistIDExeption() {}
    public  NotExistIDExeption(String message) {
        super(message);
    }
}
