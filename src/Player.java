import java.util.ArrayList;

//Gives the player and dealer a hand to play with.
public class Player { public ArrayList<Card> hand;


    //constructor
    public Player() {
        hand = new ArrayList<Card>();
    }
    //parameter, adds cards to the hand.
    public void addCard(Card card) {
        
        hand.add(card);
    }
    //getter, returns players hand
    public ArrayList<Card> getHand() {
        return hand;
    }

    //This method calculates and returns the score of the player's hand in a Blackjack game.
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
