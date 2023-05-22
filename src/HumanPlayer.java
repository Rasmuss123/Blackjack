// HumanPlayer gives the cards to you
class HumanPlayer extends Player {
   // calculateHandValue calculates the hand value and shows it when you run it.
    public int calculateHandValue() {
        int handValue = 0;
        for (Card card : hand) {
            handValue += card.getValue();
        }
        return handValue;
    }
}

