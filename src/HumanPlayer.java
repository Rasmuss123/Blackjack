class HumanPlayer extends Player {
    public int calculateHandValue() {
        int handValue = 0;
        for (Card card : hand) {
            handValue += card.getValue();
        }
        return handValue;
    }
}

