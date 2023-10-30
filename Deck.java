//modified oct 11.23
package deckOfCards;

import java.util.Arrays;
import java.util.Random;

public class Deck {
    private Card[] cards;
    private int numberOfCards;

    public Deck() {
        cards = new Card[DeckConstants.MAXCARDSINDECK];
        int index = 0;
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards[index++] = new Card(rank, suit);
            }
        }
        numberOfCards = DeckConstants.MAXCARDSINDECK;
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = numberOfCards - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Card temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
        }
    }

    public Card draw() {
        if (numberOfCards == 0) {
            System.out.println("Your deck is empty.");
            return null;
        }
        Card drawnCard = cards[--numberOfCards];
        cards[numberOfCards] = null;
        return drawnCard;
    }

    public Card[] deal(int cardsToDeal) {
        if (numberOfCards < cardsToDeal) {
            System.out.println("Not enough cards left to deal.");
            return null;
        }
        
        Card[] hand = new Card[cardsToDeal];
        for (int i = 0; i < cardsToDeal; i++) {
            hand[i] = draw();
        }
        return hand;
    }

    public int cardsLeft() {
        return numberOfCards;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(cards, numberOfCards));
    }
}

