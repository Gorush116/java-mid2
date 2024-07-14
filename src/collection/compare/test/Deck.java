package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    
    /*
        덱 멤버변수
        1. 카드뭉치
     */
    private List<Card> cards = new ArrayList<>();

    /*
        덱 기능
        1. 기본생성자
            - 2,3의 기능이 포함되어 있어야 함
        2. 덱 초기값 설정
            - 각 문양과 숫자 카드들을 모두 카드뭉치에 더함
        3. 카드뭉치 섞기
            - 현재 카드의 순서를 무작위로 배치
        4. 카드 뽑기
            - 카드뭉치의 가장 앞 인덱스에 위치한 카드를 제거하여 반환
     */
    public Deck() {
        initCard();
        shuffle();
    }

    private void initCard() {
        for (int i = 1; i <= 13; i++) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(i, suit));
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.remove(0);
    }
}
