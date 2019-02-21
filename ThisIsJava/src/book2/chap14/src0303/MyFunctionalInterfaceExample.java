package book2.chap14.src0303;

// 매개변수가 있는 람다식
public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(2);

        fi = (x) -> {
            System.out.println(x*5);
        };
        fi.method(2);

        // 매개변수 하나일때 괄호 생략.
        fi = x -> System.out.println(x*5);
        fi.method(2);

    }
}
