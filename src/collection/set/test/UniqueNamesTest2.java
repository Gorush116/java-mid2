package collection.set.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        List<Integer> list1 = Arrays.asList(inputArr);  // Java 1.2~
        List<Integer> list2 = List.of(inputArr);        // Java 1.9~ (권장)

        Set<Integer> linkedHashSet = new LinkedHashSet<>(List.of(inputArr));
        System.out.println(linkedHashSet);
    }
}
