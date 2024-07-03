package generic.test.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object obj = GenericMethod.objMethod(i);
        Integer integer = (Integer) GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer i1 = GenericMethod.<Integer>genericMethod(i); // 타입 인자를 앞에 채워줄 때 해당 인자로 변환되어 실행됨
        Integer i2 = GenericMethod.<Integer>numberMethod(i);
        Double db = GenericMethod.<Double>numberMethod(20.0);

        System.out.println("타입 추론");
        Integer i11 = GenericMethod.genericMethod(i); // 인자로 들어오는 값을 통해 Java가 타입을 추론할 수 있음
        Integer i12 = GenericMethod.numberMethod(i);
        Double db1 = GenericMethod.numberMethod(20.0);
    }
}
