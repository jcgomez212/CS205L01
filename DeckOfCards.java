package deckOfCards;

public class DeckOfCards {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("Initial deck:");
        System.out.println(deck);

        deck.shuffle();
        System.out.println("\nShuffled deck:");
        System.out.println(deck);

        System.out.println("\nDrew a card: " + deck.draw());
        System.out.println("\nCards left in the deck: " + deck.cardsLeft());
    }
}
