package book1.chap11;

// 동적객체 생성 및 실행
public class NewInstanceExample {
    public static void main(String[] args) {
        try {
            // 해당 클래스 객체를 생성하기 전에 동적으로 객체 생성
            Class clazz = Class.forName("book1.chap11.SendAction");
            // Class clazz = Class.forName("book1.chap11.ReceiveAction");

            // newInstance() 메소드의 리턴타입이 Object이므로 강제타입변환
            Action action = (Action) clazz.newInstance();
            action.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
