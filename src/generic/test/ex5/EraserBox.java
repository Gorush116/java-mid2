package generic.test.ex5;

public class EraserBox<T> {

    public boolean instanceCheck(Object param) {
//        return param instanceof T; // Condition 'param instanceof T' is redundant and can be replaced with a null check
        // T는 런타임에 모두 Object가 되어 항상 참이 됨 -> 오류 발생
        return false;
    }

    public void create() {
//        return new T(); // Type parameter 'T' cannot be instantiated directly
        // new T는 항상 new Object가 되어버림 -> 의도와 다른 동작으로 인한 오류
    }
}
