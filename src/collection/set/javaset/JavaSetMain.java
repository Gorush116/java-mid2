package collection.set.javaset;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        run(hashSet);           // 입력 순서 보장 X O(1)
        run(linkedHashSet);     // 입력 순서 보장 O(1)
        run(treeSet);           // 데이터 값을 기준으로 정렬 O(log n)

    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");
//        System.out.println("set = " + set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
