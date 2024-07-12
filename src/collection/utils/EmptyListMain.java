package collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {

    public static void main(String[] args) {
        // 빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // 빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList();  // Java 5~
        List<Integer> list4 = List.of();                // Java 9~(권장)

        System.out.println("list3 = " + list3);
        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4 = " + list4);
        System.out.println("list4.getClass() = " + list4.getClass());

        List<Integer> list5 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = List.of(1, 2, 3);

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrList = Arrays.asList(arr); // 매우매우 큰 배열을 쓸 때 효과적일 수 있음(그대로 사용하기 때문) - 유일한 고려 케이스
        List<Integer> arr1 = List.of(arr);          // 위를 제외한 모든 경우 이것을 권장(새로 생성, 불변)

        arrList.set(0, 100); // arrList 변경시 arr 값도 변경됨(참조) -> 배열을 그대로 활용하기 때문
        arr[4] = 20;

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arrList = " + arrList);

    }
}
