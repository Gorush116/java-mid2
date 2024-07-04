package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을 Animal 혹은 그 자식들만 들어올 수 있다고 추론 -> 컴파일 에러 발생하지 않음
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        // 컴파일 오류발생하지 않음(타입 추론)
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
