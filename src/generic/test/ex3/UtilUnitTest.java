package generic.test.ex3;

import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.Zealot;

public class UtilUnitTest {

    public static void main(String[] args) {

        Marine m1 = new Marine("마린1", 40);
        Marine m2 = new Marine("마린1", 50);

        Marine maxMarine = UnitUtil.maxHp(m1, m2);
        System.out.println("maxMarine: " + maxMarine);

        Zealot z1 = new Zealot("질럿1", 100);
        Zealot z2 = new Zealot("질럿1", 150);

        Zealot maxZealot = UnitUtil.maxHp(z1, z2);
        System.out.println("maxZealot: " + maxZealot);
    }
}
