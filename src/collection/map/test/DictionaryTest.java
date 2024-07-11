package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q') : ");
            String english = sc.nextLine();
            if (english.equals("q")) {
                break;
            }

            System.out.print("한글 뜻을 입력하세요 : ");
            String korean = sc.nextLine();

            if (!(english.isBlank() || korean.isBlank())) {
                dictionary.put(english, korean);
            } else {
                System.out.println("단어를 입력하셔야 합니다. 다시 입력해주세요.");
            }
        } // end of while----------


        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q') : ");
            String searchWord = sc.nextLine();
            if (searchWord.equals("q")) {
                break;
            }

            if (dictionary.containsKey(searchWord)) {
                System.out.println(searchWord + "의 뜻 : " + dictionary.get(searchWord));
            } else {
                System.out.println("입력하신 영어 단어 " + searchWord + "은(는) 사전에서 찾을 수 없습니다.");
            }
        } // end of while----------
    }
}
