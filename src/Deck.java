import java.util.ArrayList;
import java.util.Collections;



   // Array that makes the deck with every card
    public class Deck { private static ArrayList<Card> cards;

       //Information about the deck, suit, value and rank
        public Deck() {
            cards = new ArrayList<Card>();
            String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
            String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
            int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
            // "builds" the deck
            for (String suit : suits) {
                for (int i = 0; i < ranks.length; i++) {
                    Card card = new Card(suit, ranks[i], values[i]);
                    cards.add(card);
                }
            }
        }
        // shuffle = random
        public void shuffle() {
            Collections.shuffle(cards);
        }

        // removes cards that has been used, you cant get the same card twice
        public static Card Deal() {
            return cards.remove(0);
        }

    }





