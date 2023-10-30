// modified mon oct 30 23'

package deckOfCards;

public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Card's equals() method invoked");
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Card card = (Card) obj;
        return rank == card.rank && suit == card.suit;
    }

    @Override
    public int hashCode() {
        System.out.println("Card's hashCode() method invoked");
        return 31 * rank.hashCode() + suit.hashCode();
    }

    @Override
    public String toString() {
        return "Card { rank=" + rank + ", suit=" + suit + " }";
    }
}
