package book1.chap11;

import java.util.Arrays;

// 배열 비교
public class SortExample {
    public static void main(String[] args) {
        // Arrays.sort() 하면 자동으로 오름차순됨.
        int[] scores = {99, 97, 98};
        Arrays.sort(scores);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "]=" + scores[i]);
        }
        System.out.println();

        String[] names = {"홍길동", "박동수", "김민수"};
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "]=" + names[i]);
        }
        System.out.println();

        Member4 m1 = new Member4("홍길동");
        Member4 m2 = new Member4("박동수");
        Member4 m3 = new Member4("김민수");
        Member4[] members = {m1, m2, m3};
        Arrays.sort(members);
        for (int i = 0; i < members.length; i++) {
            System.out.println("members[" + i + "].name=" + members[i].name);
        }
    }
}