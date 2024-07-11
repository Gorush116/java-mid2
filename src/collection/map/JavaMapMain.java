package collection.map;

import com.sun.source.tree.Tree;

import java.util.*;

public class JavaMapMain {

    public static void main(String[] args) {
        run(new HashMap<>());               // 입력 순서 보장하지 않음 O(1)
        run(new LinkedHashMap<>());         // 키 입력 순서 기준 정렬 O(1)
        run(new TreeMap<>());               // 키 자체 데이터 값 기준 정렬 O(log n)
    }

    private static void run(Map<String, Integer> map) {
        System.out.println("map = " + map.getClass());
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("key = " + key + ", value = " + map.get(key));
        }
        System.out.println();
    }
}
