package chap06_1;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer();

        // 메소드의 매개변수 수를 모를 때
        // 배열로 넘겨줌.
        int[] values1 = {1,2,3};
        int result1 = myCom.sum1(values1);
        System.out.println("result1 : " + result1);

        int result2 = myCom.sum1(new int[] {1,2,3,4,5});
        System.out.println("result2 : " + result2);

        // 리스트값으로 매개변수 넘겨줌
        int result3 = myCom.sum2(1,2,3);
        System.out.println("result3 : " + result3);

        int result4 = myCom.sum2(1,2,3,4,5);
        System.out.println("result4 : " + result4);
    }
}