package book1.chap10;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {}
    public  WrongPasswordException(String message) {
        super(message);
    }
}
