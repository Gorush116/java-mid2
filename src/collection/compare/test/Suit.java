package collection.compare.test;

public enum Suit {
    /*
        카드의 속성을 정의하는 enum
        - 문양을 상수로 정의하여 변경 및 수정 방지
     */

    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLOVER("♣");

    private final String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
