package chap11;

// getClass()와 forName() 예제
public class ClassExample {
    public static void main(String[] args) {
        Car car = new Car("현대");
        // getClass() 메소드는 해당클래스로 객체를 생성했을때만 사용.
        Class clazz1 = car.getClass();
        System.out.println(clazz1.getName());
        System.out.println(clazz1.getSimpleName());
        System.out.println(clazz1.getPackage().getName());
        System.out.println();

        try {
            // Class.forName() 메소드는 매개값으로 주어진 클래스 찾지못하면 ClassNotFoundException 발생
            Class clazz2 = Class.forName("chap11.Car");
            System.out.println(clazz2.getName());
            System.out.println(clazz2.getSimpleName());
            System.out.println(clazz2.getPackage().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}