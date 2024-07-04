package generic.test.ex4;

import generic.animal.Animal;

public class AnimalMethod {

    public static <T extends Animal> void checkup(T t) {
        // T의 타입을 Animal 혹은 그 자식들만 들어올 수 있다고 추론 -> 컴파일 에러 발생하지 않음
        System.out.println("동물 이름 : " + t.getName());
        System.out.println("동물 크기 : " + t.getSize());
        t.sound();
    }

    public static <T extends Animal> T bigger(T t1, T t2) {
        // 컴파일 오류발생하지 않음(타입 추론)
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }
}
