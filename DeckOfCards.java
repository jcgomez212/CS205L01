//modified oct.11.23
package deckOfCards;

import java.util.Arrays;

public class DeckOfCards {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the number of cards that will be given to each player.");
            return;
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
    }
}

