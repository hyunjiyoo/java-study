package chap04;

// for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보세요.
public class Exercise03 {
    public static void main(String[] args) {
        int sum = 0;

        for (int num=1; num<=100; num++) {
            if (num%3 == 0) {
                sum += num;
            }
        }
        System.out.println("3의 배수의 총합: " + sum);
    }
}
