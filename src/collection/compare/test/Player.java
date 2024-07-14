package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {

    /*
        플레이어 멤버변수
        1. 이름
        2. 손패
     */
    private String name;
    private List<Card> hand;

    /*
        플레이어 기능
        1. 생성자(param : 이름)
        2. 카드 봅기
        3. 손에 있는 카드 숫자 합 계산
        4. 카드 기준에 맞춰 정렬
     */
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void drawCard(Deck deck) {
        hand.add(deck.drawCard());
    }

    public int rankSum() {
        int value = 0;
        for (Card card : hand) {
            value += card.getRank();
        }
        return value;
    }

    public void showHand() {
        hand.sort(null);
        System.out.println(name + " 의 카드 : " + hand + ", 합계 : " + rankSum());
    }

    public String getName() {
        return name;
    }
}
