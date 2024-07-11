package collection.set.test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> hashSet = new HashSet<>();

        Collections.addAll(hashSet, inputArr);
        System.out.println(hashSet);
    }
}
