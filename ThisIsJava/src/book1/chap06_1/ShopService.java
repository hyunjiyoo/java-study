package book1.chap06_1;

public class ShopService {

    private static ShopService singleton = new ShopService();
    private ShopService() {}

    public static ShopService getInstance() {
        return singleton;
    }
}
