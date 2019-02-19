package book1.chap09;

// UI 클래스
public class Window {
    Button2 button1 = new Button2();
    Button2 button2 = new Button2();

    // 필드선언과 초기값 대입
    Button2.OnClickListener listener = new Button2.OnClickListener() {
        @Override
        public void onClick() {
            System.out.println("전화를 겁니다.");
        }
    };

    Window() {
        // 매개값으로 필드 대입
        button1.setOnClickListener(listener);
        // 매개값으로 익명 구현 객체 대입
        button2.setOnClickListener(new Button2.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("메세지를 보냅니다.");
            }
        });
    }
}
