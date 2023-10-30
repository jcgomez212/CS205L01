// modified mon oct 30 23'

package deckOfCards;

public class DeckOfCardTest {

    public static void main(String[] args) {
        // verify Card constructor
        Card c1 = new Card(Rank.EIGHT, Suit.HEART);
        Card c2 = new Card(Rank.TWO, Suit.HEART);
        Card c3 = new Card(Rank.NINE, Suit.HEART);
        System.out.println("Card c1: " + c1);
        System.out.println("Card c2: " + c2);
        System.out.println("Card c3: " + c3);

        // verify Deck constructor & toString
        Deck deck = new Deck();
        System.out.println("Newly created deck:\n" + deck);
        deck.shuffle();
        System.out.println("Shuffled deck:\n" + deck);

        try {
            System.out.println("Draw card: " + deck.draw());
            System.out.println("Draw card: " + deck.draw());
            System.out.println("Draw card: " + deck.draw());

            int cardsLeft = deck.cardsLeft();
            System.out.println("cardsLeft: " + cardsLeft);

            for (int i = 0; i < cardsLeft + 1; i++) {
                System.out.println("Draw card: " + deck.draw());
            }
        } catch (DeckException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Complete");
    }
}
