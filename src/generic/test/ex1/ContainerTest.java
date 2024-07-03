package generic.test.ex1;

public class ContainerTest {

    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        System.out.println("빈값 확인1 : " + stringContainer.isEmpty());

        stringContainer.setItem("data1");
        System.out.println("저장 데이터 : " + stringContainer.get());
        System.out.println("빈값 확인2 : " + stringContainer.isEmpty());

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setItem(2);
        System.out.println("저장 데이터 : " + integerContainer.get());
    }
}
