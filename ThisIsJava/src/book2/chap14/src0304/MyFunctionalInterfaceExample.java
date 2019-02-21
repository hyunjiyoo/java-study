package book2.chap14.src0304;

// 리턴값이 있는 람다식
public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = (x,y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(fi.method(2,5));

        fi = (x,y) -> {
            return x + y;
        };
        System.out.println(fi.method(2,5));

        fi = (x,y) -> x+ y;
        System.out.println(fi.method(2,5));

        fi = (x,y) -> sum(x, y);
        System.out.println(fi.method(2,5));
    }

    public static int sum(int x, int y) {
        return (x + y);
    }
}
