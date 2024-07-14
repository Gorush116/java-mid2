package collection.compare.test;

public class Card implements Comparable<Card> {

    // 카드 멤버변수
    /*
        트럼프 카드에 필요한 요소
        - 문양
        - 숫자
     */
    private Suit suit;
    private int rank;


    // 카드 메서드
    /*
        1. 생성자
        2. Getter
        3. 다른 카드와 비교
            - Comparable 인터페이스 구현해야 함
     */
    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(Card anotherCard) {
        // 숫자를 먼저 비교하고, 숫자가 같으면 마크를 비교
        if (this.rank != anotherCard.rank) {
            return Integer.compare(this.rank, anotherCard.rank);
        } else {
            return this.suit.compareTo(anotherCard.suit);
        }
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
