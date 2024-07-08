package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> countList = new ArrayList<>();

        System.out.print("n개의 정수를 입력하세요 (종료 0) : ");
        while (true) {
            int count = sc.nextInt();
            if (count == 0) {
                break;
            }

            countList.add(count);
        }

        System.out.println("출력");
//        System.out.println(Arrays.toString(countList.toArray()));
        for (int i = 0; i < countList.size(); i++) {
            System.out.print(countList.get(i));
            if (i < countList.size() - 1) {
                System.out.print(", ");
            }
        }

    }
}
