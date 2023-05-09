import java.util.ArrayList;
import java.util.Collections;



    public class Deck { private static ArrayList<Card> cards;

        public Deck() {
            cards = new ArrayList<Card>();
            String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
            String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
            int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

            for (String suit : suits) {
                for (int i = 0; i < ranks.length; i++) {
                    Card card = new Card(suit, ranks[i], values[i]);
                    cards.add(card);
                }
            }
        }

        public void shuffle() {
            Collections.shuffle(cards);
        }

        public static Card Deal() {
            return cards.remove(0);
        }

    }





