package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerbox = new GenericBox(); // rowType, 사용 금지
//      GenericBox<Object> objectGenericBox = new GenericBox<>(); // 권장
        integerbox.set(10);
        Integer result = (Integer) integerbox.get();
        System.out.println("result = " + result);

    }
}
