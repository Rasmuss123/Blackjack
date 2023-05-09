import java.util.Scanner;



    class Blackjack {
        {

            {
                Scanner scanner = new Scanner(System.in);
                Deck deck = new Deck();
                deck.shuffle();
                Player player = new Player();
                Player dealer = new Player();

                // Deal the initial cards
                player.addCard(Deck.Deal());
                dealer.addCard(Deck.Deal());
                player.addCard(Deck.Deal());
                dealer.addCard(Deck.Deal());

                // Players turn
                while (true) {
                    System.out.println("Your hand: " + player.getHand() + " (" + player.getScore() + ")");
                    System.out.println("Dealer's hand: " + dealer.getHand().get(0) + " (score hidden)");
                    System.out.print("Hit or stand? ");
                    String input = scanner.nextLine();
                    if (input.equalsIgnoreCase("hit")) {
                        player.addCard(Deck.Deal());
                        if (player.getScore() > 21) {
                            System.out.println("Dealer wins.");
                        }
                    } else if (input.equalsIgnoreCase("stand")) {
                        break;
                    } else {
                        System.out.println("Error");
                    }
                }

                // Dealers turn
                while (dealer.getScore() < 17) {
                    dealer.addCard(Deck.Deal());
                }
                System.out.println("Your hand: " + player.getHand() + " (" + player.getScore() + ")");
                System.out.println("Dealer's hand: " + dealer.getHand() + " (" + dealer.getScore() + ")");

                // Determine the winner
                int playerScore = player.getScore();
                int dealerScore = dealer.getScore();
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


