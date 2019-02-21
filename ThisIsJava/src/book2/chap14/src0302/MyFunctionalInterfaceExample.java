package book2.chap14.src0302;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };
        fi.method();

        fi = () -> {
            System.out.println("method call2");
        };
        fi.method();

        // 실행문 하나이면 중괄호 생략가능
        fi = () -> System.out.println("method call3");
        fi.method();
    }
}
