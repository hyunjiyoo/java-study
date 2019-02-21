package book1.chap11;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println(strObj);

        // myPhone.toString()을 자동호출해서 리턴값 얻은 후 출력
        System.out.println(myPhone);
    }
}
