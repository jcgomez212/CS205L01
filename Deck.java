package deckOfCards;

import java.util.Random;

public class Deck {
    private Card[] cards;
    private int size;

    public Deck() {
        cards = new Card[DeckConstants.MAXCARDSINDECK];
        size = 0;
        for (int rank = Card.MINRANK; rank <= Card.MAXRANK; rank++) {
            for (int suit = Card.MINSUIT; suit <= Card.MAXSUIT; suit++) {
                cards[size++] = new Card(rank, suit);
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = size - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Card temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
        }
    }

    public Card draw() {
        if (size == 0) {
            throw new IllegalStateException("Deck is empty.");
        }
        Random random = new Random();
        int index = random.nextInt(size);
        Card drawnCard = cards[index];
        cards[index] = cards[size - 1];
        cards[size - 1] = null;
        size--;
        return drawnCard;
    }

    public int cardsLeft() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(cards[i]).append(i < size - 1 ? ", " : "]");
        }
        return sb.toString();
    }
}
