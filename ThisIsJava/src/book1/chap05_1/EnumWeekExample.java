package book1.chap05_1;

import java.util.Calendar;

public class EnumWeekExample {
    public static void main(String[] args) {
        // 열거타입 변수 선언
        Week today = null;

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK); // 일(1) ~ 토(7)까지의 숫자를 리턴

        switch (week) {
            case 1:
                // 열거타입의 열거상수 가져와서 열거변수에 대입
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }
        System.out.println("오늘 요일 : " + today);
    }
}
