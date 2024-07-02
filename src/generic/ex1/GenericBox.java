package generic.ex1;

public class GenericBox<T> { // <> : 다이아몬드, T : 타입 매개변수

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
