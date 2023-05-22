
   // Definds the cards with suit, rank and value
    public class Card {
        private String suit;
        private String rank;
        private int value;

        //constructor for the Card class.
        public Card(String suit, String rank, int value) {
            this.suit = suit;
            this.rank = rank;
            this.value = value;
        }


        //This method allows us to retrieve the rank field for a Card object.
        public String getRank() {
            return rank;
        }


        //This method allows us to retrieve the value field for a Card object.
        public int getValue() {
            return value;
        }

       // This method returns the whole thing that runs.
        public String toString() {
            return rank + " of " + suit;
        }
    }




