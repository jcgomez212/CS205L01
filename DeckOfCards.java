//modified mon oct 30 23'

package deckOfCards;

import java.util.Arrays;
import deckOfCards.DeckException;
import deckOfCards.DeckOfCardsConstants;

public class DeckOfCards {
    public static void main(String[] args) {
        try {
            if (args.length < 1) {
                throw new ArrayIndexOutOfBoundsException("Number of cards argument is missing.");
            }

            int CARDSINHAND = Integer.parseInt(args[0]);

            Deck deck = new Deck();
            deck.shuffle();
            System.out.println("Shuffled deck:");
            System.out.println(deck);

            Card[] player1Hand = deck.deal(CARDSINHAND);
            Card[] player2Hand = deck.deal(CARDSINHAND);
            Card[] player3Hand = deck.deal(CARDSINHAND);
            Card[] player4Hand = deck.deal(CARDSINHAND);

            System.out.println("\nPlayer 1's Hand: " + Arrays.toString(player1Hand));
            System.out.println("Player 2's Hand: " + Arrays.toString(player2Hand));
            System.out.println("Player 3's Hand: " + Arrays.toString(player3Hand));
            System.out.println("Player 4's Hand: " + Arrays.toString(player4Hand));
            System.out.println("\nRemaining cards in the deck:");
            System.out.println(deck);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(DeckOfCardsConstants.BADNUMBEROFARGUMENTS);
        } catch (NumberFormatException e) {
            System.err.println("Error: Provided argument is not a valid number.");
            System.exit(DeckOfCardsConstants.BADINT);
        } catch (DeckException e) {
            System.err.println("Error: Cannot deal. " + e.getMessage());
            e.printStackTrace();
        }
    }
}