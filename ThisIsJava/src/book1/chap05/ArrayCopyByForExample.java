package book1.chap05;
// for문으로 배열복사
// 배열은 한번 생성하면 크기변경 안됨.
// 따라서 더 많은 저장 공간 필요하다면 더 큰 배열 새로 만들고 복사.
public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5];

        // 배열 복사
        for (int i=0; i<oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }
        // 복사한 배열 출력
        for(int i=0; i<newIntArray.length; i++) {
            System.out.print(newIntArray[i] + ", ");
        }
    }
}
