package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);

        // 하위 타입 전달 불가(하한이 Animal 으로 제한됨)
        // java: incompatible types: generic.test.ex5.Box<generic.animal.Dog> cannot be converted to generic.test.ex5.Box<? super generic.animal.Animal>
//        writeBox(dogBox); 

    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
