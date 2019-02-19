package book1.chap05;
// 향상된 for문
public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {95,71,84,93,90};

        int sum = 0;
        // for ( 타입변수 : 배열 )
        for (int score : scores) {
            sum += score;
        }
        System.out.println("점수 총합 = " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);
    }
}