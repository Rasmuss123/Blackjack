import java.util.Scanner;




// Main class, everything that happends when the game is run is written here.
class Blackjack {
        {

            {
                Scanner scanner = new Scanner(System.in);
                Deck deck = new Deck();
                deck.shuffle();
                HumanPlayer HumanPlayer = new HumanPlayer();
                HumanPlayer dealer = new HumanPlayer();

                // Deal the initial cards
                HumanPlayer.addCard(Deck.Deal());
                dealer.addCard(Deck.Deal());
                HumanPlayer.addCard(Deck.Deal());
                dealer.addCard(Deck.Deal());

                // Players turn
                while (true) {
                    System.out.println("Your hand: " + HumanPlayer.getHand() + " (" + HumanPlayer.getScore() + ")");
                    System.out.println("Dealer's hand: " + dealer.getHand().get(0) + " (score hidden)");
                    System.out.print("Hit or stand? ");
                    String input = scanner.nextLine();
                    if (input.equalsIgnoreCase("hit")) {
                        HumanPlayer.addCard(Deck.Deal());
                        if (HumanPlayer.calculateHandValue() > 21) {
                            System.out.println("Dealer wins.");
                        }
                    } else if (input.equalsIgnoreCase("stand")) {
                        break;
                    } else {
                        System.out.println("Error");
                    }
                }

                // Dealers turn
                while (dealer.calculateHandValue() < 17) {
                    dealer.addCard(Deck.Deal());
                }
                // Updates the new hand when dealer gets new card
                System.out.println("Your hand: " + HumanPlayer.getHand() + " (" + HumanPlayer.getScore() + ")");
                System.out.println("Dealer's hand: " + dealer.getHand() + " (" + dealer.getScore() + ")");

                // Determine the winner
                int playerScore = HumanPlayer.calculateHandValue();
                int dealerScore = dealer.calculateHandValue();
                if (playerScore > dealerScore & playerScore <= 21 || dealerScore > 21 & playerScore <= 21) {
                    System.out.println("You win!");
                } else if (playerScore < dealerScore || playerScore > 21 ) {
                    System.out.println("Dealer wins.");
                } else {
                    System.out.println("Push.");
                }

            }
        }
    }


