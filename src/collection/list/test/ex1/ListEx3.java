package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> countList = new ArrayList<>();
        int sum = 0;
        double average = 0;

        System.out.print("n개의 정수를 입력하세요 (종료 0) : ");
        while (true) {
            int count = sc.nextInt();
            if (count == 0) {
                break;
            }

            countList.add(count);
        }

        System.out.println("출력");
        for (Integer integer : countList) {
            sum += integer;
        }
        average = (double) sum / countList.size();
        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + average);

    }
}
