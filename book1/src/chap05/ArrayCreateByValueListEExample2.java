package chap05;

public class ArrayCreateByValueListEExample2 {
    public static void main(String[] args) {
        // 배열 선언 후, 값은 넣어줄 때는 new 연산자 사용!!
        int[] scores;
        scores = new int[] {83,90,87};
        int sum1 = 0;
        for (int i=0; i<3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합: " + sum1);

        // add() 메소드로 전달될 때,
        // int[] scores; 선언이 먼저 된 후,
        // scores = new int[] {83,90,87}; 이 객체가 인자값으로 전달.
        int sum2 = add(new int[] {83,90,87});
        System.out.println("총합: " + sum2);
        System.out.println();
    }
    // add() 메소드
    public static int add(int[] scores) {
        int sum = 0;
        for (int i=0; i<3; i++) {
            sum += scores[i];
        }
        return sum;
    }
}