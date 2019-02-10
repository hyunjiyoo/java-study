package chap10;
/*
ClassCastException:
상위클래스와 하위클래스 그리고 구현클래스와 인터페이스 간에 타입변환을 잘못 시도할 경우 발생.
 */
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat);
    }
    public static void changeDog(Animal animal) {
        // if (animal instanceof Dog) {
        Dog dog = (Dog) animal;  // ClassCastException 발생 가능
        // }
    }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
