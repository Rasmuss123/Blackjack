import java.util.ArrayList;

public class Player { public ArrayList<Card> hand;

    public Player() {
        hand = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        
        hand.add(card);
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getScore() {
        int score = 0;
        int numAces = 0;
        for (Card card : hand) {
            score += card.getValue();
            if (card.getRank().equals("Ace")) {
                numAces++;
            }
        }
        while (score > 21 && numAces > 0) {
            score -= 10;
            numAces--;
        }
        return score;
    }

}
