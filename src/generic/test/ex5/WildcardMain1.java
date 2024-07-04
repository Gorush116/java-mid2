package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));
        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printWildcardV1(dogBox);

        WildCardEx.printGenericV2(dogBox);
        WildCardEx.printWildcardV2(dogBox);

        Dog dog = WildCardEx.printAndReturnGeneric(dogBox);

        catBox.set(new Cat("야옹이", 100));
        Cat cat = WildCardEx.printAndReturnGeneric(catBox);

        Animal wildDog = WildCardEx.printAndReturnWildcard(dogBox);
        Animal wildCat = WildCardEx.printAndReturnWildcard(catBox);
    }
}
