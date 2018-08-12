package chap05;
/*
위 예제를 그냥 실행하면 if문안의 문자열이 출력된다.
그 이유는 실행할 때 매개값을 주지 않았기 때문에 길이 0인 String 배열이 매개값으로 전달된다.
따라서 args.length는 0이므로 if조건식이 true가 되어 if문 블록이 실행된 것.
(따로 매개값을 주고 실행하려면 메뉴에서 [Run -> Run Configurations...] 가서 argument에 숫자 넣어주면 된다.)
 */
public class MainStringArrayArgument {
    public static void main(String[] args) {
        // 입력된 데이터 개수가 두 개가 아닐 경우
        if (args.length != 2) {
            System.out.println("프로그램의 사용법");
            System.out.println("java MainStringArrayArgument num1 num2");
            System.exit(0); // 프로그램 강제 종료
        }

        String strNum1 = args[0]; // 첫 번째 데이터 얻기
        String strNum2 = args[1]; // 두 번째 데이터 얻기

        int num1 = Integer.parseInt(strNum1); // 문자열을 정수로 변환.
        int num2 = Integer.parseInt(strNum2); // 문자열을 정수로 변환.

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}