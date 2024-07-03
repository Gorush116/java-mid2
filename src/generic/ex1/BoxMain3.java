package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<>(); // 생성 시점의 T의 타입이 결정됨
        integerBox.set(10);
//        integerBox.set("문자100"); // incompatible types: java.lang.String cannot be converted to java.lang.Integer
        Integer integer = integerBox.get(); // Integer 타입 반환
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("Hello");
        String string = stringBox.get();
        System.out.println("string = " + string);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(3.14);
        double double1 = doubleBox.get();
        System.out.println("double1 = " + double1);

        // 타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}
