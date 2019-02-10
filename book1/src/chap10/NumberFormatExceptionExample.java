package chap10;

/*
NumberFormatException:
숫자로 변환될 수 없는 문자가 포함되어 있을 때 발생
*/
public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";

        // 문자열을 정수로 변환해서 리턴
        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);

        int result = value1 + value2;
        System.out.println(data1 + "+" + data2 + "=" + result);
    }
}
