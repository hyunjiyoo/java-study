package book1.chap11;

import java.util.Arrays;
import java.util.Random;

// 로또 번호 얻기
public class RandomExample2 {
    public static void main(String[] args) {
        // 선택번호
        // 선택번호 6개가 저장될 배열 생성
        int[] selectNumber = new int[6];
        // seed값으로 3을 줌
        Random random = new Random(3);
        System.out.print("선택번호: ");
        for (int i = 0; i < 6; i++) {
            // 선택번호 얻어 배열에 저장
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print(selectNumber[i] + " ");
        }
        System.out.println();

        // 당첨번호
        // 당첨번호 6개가 저장될 배열 생성
        int[] winnerNumber = new int[6];
        // seed값으로 5를 줌
        random = new Random(5);
        System.out.print("당첨 번호: ");
        for (int i = 0; i < 6; i++) {
            winnerNumber[i] = random.nextInt(45) + 1;
            System.out.print(winnerNumber[i] + " ");
        }
        System.out.println();

        // 당첨여부
        // 비교전 정렬!!
        Arrays.sort(selectNumber);
        Arrays.sort(winnerNumber);
        // 서로 다른 seed값을 가지고 있기때문에 동일한 난수 생성 X
        boolean result = Arrays.equals(selectNumber, winnerNumber);
        System.out.print("당첨 여부: ");
        if (result) {
            System.out.println("1등에 당첨되셨습니다.");
        } else {
            System.out.println("당첨되지 않았습니다.");
        }

    }
}
