package book1.chap05;
// 2차원 배열 (계단식구조)
public class ArrayInArrayExample {
    public static void main(String[] args) {
        // 배열 참조변수 생성하여 객체 참조. (초기값은 0이다)
        // 2 x 3 크기의 배열 먼저 생성
        int[][] mathScores = new int[2][3];
        for (int i=0; i<mathScores.length; i++) {
            for(int k=0; k<mathScores[i].length; k++) {
                System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
            }
        }
        System.out.println();

        // 계단식 구조의 배열. 인덱스'0'의 배열은 크기가 2이고, 인덱스'1'의 배열은 크기가 3.
        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];
        for(int i=0; i<englishScores.length; i++) {
            for(int k=0; k<englishScores[i].length; k++) {
                System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);
            }
        }
        System.out.println();

        // 값을 넣어 배열객체 생성.
        int[][] javaScores = { {95,80}, {92,96,80}};
        for (int i=0; i<javaScores.length; i++) {
            for (int k=0; k<javaScores[i].length; k++) {
                System.out.println("javaScores[" + i + "][" + k + "]=" + javaScores[i][k]);
            }
        }
    }
}
