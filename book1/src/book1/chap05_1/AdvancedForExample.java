package book1.chap05_1;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = { 95,71,84,93,87 };

        int sum = 0;
        // 향상된 for문 => for (int 변수 : 배열)
        // 배열만큼 돌아서 변수에 저장
        for (int score : scores) {
            sum += score;
        }
        System.out.println("점수 총합 = " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);
    }
}