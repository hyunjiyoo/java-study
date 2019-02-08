package chap04_1;

/*
* System.in.read() 메소드는 하나의 키코드만 읽기 때문에 콘솔에 입력된 문자열 한 번에 읽을 수 없다.
* 대신 Scanner 객체 생성하고 nextLine() 메소드를 호출하면 콘솔에 입력된 문자열 한 번에 읽을 수 있다.
* Scanner scanner = new Scanner(System.in);
* nextLine() 메소드로 읽은 문자열을 저장하기 위해서 String 변수 필요하여 inputString 변수에 저장함.
* String inputString = scanner.nextLine();
*/

public class WhileKeyControlExample {
    public static void main(String[] args) throws Exception {
        boolean run = true;
        int speed = 0;
        int keyCode = 0;

        while (run) {
            // enter키 입력되면 캐리지리턴(13)과 라인피드(10)가 입력되므로 이 값을 제외시킴
            if (keyCode != 13 && keyCode != 10) {
                System.out.println("-----------------------------------");
                System.out.println("1.증속 | 2. 감속 | 3. 중지");
                System.out.println("-----------------------------------");
                System.out.print("선택");
            }

            // 키보드의 키코드를 읽음
            keyCode = System.in.read();

            if (keyCode == 49) { // 키보드에서 1을 읽었을 때
                speed++;
                System.out.println("현재 속도=" + speed);
            } else if (keyCode == 50) { // 키보드에서 2을 읽었을 때
                speed--;
                System.out.println("현재 속도=" + speed);
            } else if (keyCode == 51) { // 키보드에서 3을 읽었을 때
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
