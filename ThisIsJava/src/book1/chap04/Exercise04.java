package book1.chap04;
/*
while문과 Math.random() 메소드 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
눈의 합이 5가 되는 조합은 (1,4),(4,1),(2,3),(3,2)
 */
public class Exercise04 {
    public static void main(String[] args) {
        while (true) {
            int num1 = (int)(Math.random()*6) + 1;
            int num2 = (int)(Math.random()*6) + 1;
            int sum = num1 + num2;
            System.out.println("(" + num1 + ", " + num2 + ")");

            // 눈의 합이 5일때, break;
            if (sum == 5) {
                break;
            }
        }
    }
}