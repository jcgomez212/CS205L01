//modified mon oct 30 23'

package deckOfCards;

import java.util.Arrays;

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

            Card[][] playersHands = new Card[4][CARDSINHAND];

            for (int i = 0; i < 4; i++) {
                playersHands[i] = deck.deal(CARDSINHAND);
                System.out.println("\nPlayer " + (i+1) + "'s Hand: " + Arrays.toString(playersHands[i]));
            }
            System.out.println("\nRemaining cards in the deck:");
            System.out.println(deck);

            int highestValue = -1;
            int highestValuePlayer = -1;
            int lowestValue = Integer.MAX_VALUE;
            int lowestValuePlayer = -1;

            for (int i = 0; i < 4; i++) {
                int currentValue = calculateHandValue(playersHands[i]);
                if (currentValue > highestValue) {
                    highestValue = currentValue;
                    highestValuePlayer = i;
                }
                if (currentValue < lowestValue) {
                    lowestValue = currentValue;
                    lowestValuePlayer = i;
                }
            }
            System.out.println("\nPlayer " + (highestValuePlayer + 1) + " has the highest hand value of " + highestValue);
            System.out.println("Player " + (lowestValuePlayer + 1) + " has the lowest hand value of " + lowestValue);

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

    public static int calculateHandValue(Card[] hand) {
        int totalValue = 0;
        for (Card card : hand) {
            totalValue += card.getRank().ordinal();
        }
        return totalValue;
    }
}
