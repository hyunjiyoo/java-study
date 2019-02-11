package chap11;

import java.util.Date;

public class ToStringExample {
    public static void main(String[] args) {
        // Object 클래스의 toString() 메소드는 객체의 문자정보 리턴 (클래스명@16진수해시코드)
        // Object 클래스의 하위클래스인 Date 클래스는 toString() 을 오버라이딩하여 시스템 날짜와 시간 정보 리턴
        Object obj1 = new Object();
        Date obj2 = new Date();

        // java.lang.Object@3ecf72fd
        // Mon Feb 11 18:30:30 KST 2019
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }
}
