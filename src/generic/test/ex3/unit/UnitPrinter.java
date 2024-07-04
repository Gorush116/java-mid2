package generic.test.ex3.unit;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {
        T unit = t1.out();
        System.out.println("V1 이름 : " + unit.getName() + ", hp : " + unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> t2) {
        BioUnit unit = t2.out();
        System.out.println("V2 이름 : " + unit.getName() + ", hp : " + unit.getHp());
    }
}
