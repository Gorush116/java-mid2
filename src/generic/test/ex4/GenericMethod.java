package generic.test.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("Object print : " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t) { // 다이아몬드, 타입 매개변수를 통해 Generic 메서드임을 표시
        System.out.println("Generic print : " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) { // 상한선 제한 가능
        System.out.println("bound print : " + t);
        return t;
    }
}
