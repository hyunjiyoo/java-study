package book1.chap06;

public class Computer {
    // 배열로 선언한 매개변수
    int sum1(int[] values) {
        int sum = 0;
        for (int i=0; i<values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
    // "..."로 선언한 매개변수
    int sum2(int ... values) {
        int sum = 0;
        for (int i=0; i<values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}
