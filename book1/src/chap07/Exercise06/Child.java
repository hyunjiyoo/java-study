package chap07.Exercise06;
/*
this(); 자기 생성자 호출
super(); 부모 생성자 호출
 */
public class Child extends Parent {
    private String name;

    public Child() {
        // super(); 는 여기에 생성하지 않는다.
        // super() 와 this() 는 함께 쓸 수 없다!!! 둘다 첫줄에 있어야함.
        // 만약 super()가 추가되면 this()가 두번째줄로 넘어가기 때문에 컴파일 에러!
        this("홍길동");
        System.out.println("Child() call"); // 4번
    }

    public Child(String name) {
        // 여기는 자기생성자를 호출하는 코드가 없다.
        // 따라서 컴파일러는 super() 를 자동 추가.
        // 그래서 Parent() 생성자 호출됨.
        this.name = name;
        System.out.println("Child(String name) call"); // 3번
    }
}
