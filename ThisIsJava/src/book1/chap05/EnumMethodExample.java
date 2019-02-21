package book1.chap05;

public class EnumMethodExample {
    public static void main(String[] args) {
        // name() 메소드 - 열거객체의 문자열을 리턴
        Week today = Week.SUNDAY;
        String name = today.name();
        System.out.println(name);

        // ordinal() 메소드 - 열거객체의 순번(0부터)을 리턴
        int ordinal = today.ordinal();
        System.out.println(ordinal);

        // compareTo() 메소드 - 열거객체를 비교해서 순번차이를 리턴 (상대적 위치)
        Week day1 = Week.MONDAY;
        Week day2 = Week.WEDNESDAY;
        int result1 = day1.compareTo(day2); // -2
        int result2 = day2.compareTo(day1); // 2
        System.out.println(result1);
        System.out.println(result2);

        // valueOf() 메소드 - 주어진 문자열의 열거 객체!!를 리턴
        if (args.length == 1) {
            String strDay = args[0];
            Week weekDay = Week.valueOf(strDay);
            if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
                System.out.println("주말 이군요");
            } else {
                System.out.println("평일 이군요");
            }
        }

        // values() 메소드 - 모든 열거객체들을 배열로 리턴
        Week[] days = Week.values();
        for (Week day : days) {
            System.out.println(day);
        }
    }
}
