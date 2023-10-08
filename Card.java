package deckOfCards;

public class Card {
    private int rank;
    private int suit;
    public static final int MAXRANK = 13;
    public static final int MINRANK = 1;
    public static final int MAXSUIT = 4;
    public static final int MINSUIT = 1;

    public Card(int rank, int suit) {
        setRank(rank);
        setSuit(suit);
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public void setSuit(int suit) {
        if (suit >= MINSUIT && suit <= MAXSUIT) {
            this.suit = suit;
        } else {
            throw new IllegalArgumentException("Invalid suit value.");
        }
    }

    public void setRank(int rank) {
        if (rank >= MINRANK && rank <= MAXRANK) {
            this.rank = rank;
        } else {
            throw new IllegalArgumentException("Invalid rank value.");
        }
    }

    @Override
    public String toString() {
        return "Card { rank=" + rank + ", suit=" + suit + " }";
    }
}
