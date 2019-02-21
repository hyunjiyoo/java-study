package book1.chap09;

public class Chatting {
    void startChat(String chatId) {
        // nickName은 final특성을 가지기때문에 중간에 값을 변경할 수 없다.
        String nickName = chatId;

        Chat chat = new Chat() {
            @Override
            void start() {
                while(true) {
                    String inputData = "안녕하세요";
                    String message = "[" + nickName + "] " + inputData;
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }

    class Chat {
        void start() {}
        void sendMessage(String message) {}
    }
}
