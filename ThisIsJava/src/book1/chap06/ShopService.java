package book1.chap06;

public class ShopService {
    // 객체를 하나만 생성 (singleton)
    private static ShopService singleton = new ShopService();

    private ShopService() { }

    public static ShopService getInstance() {
        return singleton;
    }
}
