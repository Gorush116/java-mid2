package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetOperationTest {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        union(set1, set2);
        intersection(set1, set2);
        except(set1, set2);

        
    }

    private static void union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("union = " + union);
    }

    private static void intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("intersection = " + intersection);
    }

    private static void except(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> except = new HashSet<>(set1);
        except.removeAll(set2);
        System.out.println("except = " + except);

    }
}
