package deckOfCards;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>(DeckConstants.MAXCARDSINDECK);
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = cards.size() - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Card temp = cards.get(index);
            cards.set(index, cards.get(i));
            cards.set(i, temp);
        }
    }

    public Card draw() {
        if (cards.isEmpty()) {
            System.out.println("Your deck is empty.");
            return null;
        }
        Random random = new Random();
        int index = random.nextInt(cards.size());
        Card drawnCard = cards.remove(index);
        return drawnCard;
    }


    public int cardsLeft() {
        return cards.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < cards.size(); i++) {
            sb.append(cards.get(i)).append(i < cards.size() - 1 ? ", " : "]");
        }
        return sb.toString();
    }
}