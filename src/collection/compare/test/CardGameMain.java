package collection.compare.test;

public class CardGameMain {

    public static void main(String[] args) {

        Deck deck = new Deck();
        Player p1 = new Player("플레이어1");
        Player p2 = new Player("플레이어2");

        for (int i = 0; i < 5; i++) {
            p1.drawCard(deck);
            p2.drawCard(deck);
        }

        p1.showHand();
        p2.showHand();

        Player winner = getWinner(p1, p2);

        if (winner != null) {
            System.out.println(winner.getName() + " 승리");
        } else {
            System.out.println("무승부입니다.");
        }
    }

    private static Player getWinner(Player p1, Player p2) {
        int sum1 = p1.rankSum();
        int sum2 = p2.rankSum();

        if (sum1 > sum2) {
            return p1;
        } else if (sum1 == sum2) {
            return null;
        } else {
            return p2;
        }
    }
}
