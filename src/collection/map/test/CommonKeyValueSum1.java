package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {
//        Map<String, Integer> map1 = new HashMap<>();
//        map1.put("A", 1);
//        map1.put("B", 2);
//        map1.put("C", 3);
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);

//        Map<String, Integer> map2 = new HashMap<>();
//        map2.put("B", 4);
//        map2.put("C", 5);
//        map2.put("D", 6);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);

        getSum(map1, map2);
    }

    private static void getSum(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String key : map2.keySet()) {
            if (map1.containsKey(key)) {
                resultMap.put(key, map1.get(key) + map2.get(key));
            }
        }
        System.out.println(resultMap);
    }
}
