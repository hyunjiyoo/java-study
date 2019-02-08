package chap05_1;


public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        // 배열을 선언하고나서 값을 넣을때는 new 연산자 사용!!
        int[] scores;
        scores = new int[] {83, 90, 87};

        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합: " + sum1);

        // add()메소드에 인자로 전달할 때도 new 연산자 사용!!
        int sum2 = add( new  int[] {83, 90, 87});

        System.out.println("총합: " + sum2);
        System.out.println();
    }
    public static int add(int[] scores) {
        int sum = 0;
        for(int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        return sum;
    }
}
