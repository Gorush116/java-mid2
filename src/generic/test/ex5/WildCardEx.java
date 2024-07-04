package generic.test.ex5;

import generic.animal.Animal;

public class WildCardEx {

    static <T> void printGenericV1(Box<T> box) { // 와일드카드는 이미 만들어진 제네릭 타입을 활용하는데 사용됨
        System.out.println("T = " + box.get());
    }

    // Box<Dog>, Box<Cat>, Box<Object>
    // 비제한 와일드카드
    static void printWildcardV1(Box<?> box) { // ? == <? extends Object>
        System.out.println("? = " + box.get());
    }
    
    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName()); // 타입 추론으로 getName() 사용 가능
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get(); // 와일드카드 상한선 제한으로 바로 Animal로 받게 됨
        System.out.println("Wildcard 이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName()); // 타입 추론으로 getName() 사용 가능
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("Wildcard 이름 = " + animal.getName()); // 타입 추론으로 getName() 사용 가능
        return animal;
    }
}
