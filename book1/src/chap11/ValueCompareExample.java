package chap11;

public class ValueCompareExample {
    public static void main(String[] args) {
        System.out.println("[-128~127 초과값일 경우]");
        Integer obj1 = 300;
        Integer obj2 = 300;

        System.out.println("==결과: " + (obj1 == obj2)); // false
        System.out.println("언박싱후 == 결과: " + (obj1.intValue() == obj2.intValue())); // true
        System.out.println("equals() 결과: " + obj1.equals(obj2)); // true
        System.out.println();

        System.out.println("[-128~127 범위값일 경우]");
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("==결과: " + (obj3 == obj4)); // true
        System.out.println("언박싱후 == 결과: " + (obj3.intValue() == obj4.intValue())); // true
        System.out.println("equals() 결과: " + obj3.equals(obj4)); // true
        System.out.println();
    }
}
