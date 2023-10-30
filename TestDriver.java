package deckOfCards;

import java.util.HashSet;
import java.util.Set;

public class TestDriver {
    public static void main(String[] args) {
        // Create a HashSet for Card objects
        Set<Card> setOfCards = new HashSet<>();

        // Create unique Card objects
        Card card1 = new Card(Rank.ACE, Suit.HEART);
        Card card2 = new Card(Rank.TWO, Suit.CLUB);
        Card card3 = new Card(Rank.THREE, Suit.SPADE);
        // ... create more cards as needed

        // Add these cards to the HashSet and print the return value
        System.out.println(setOfCards.add(card1));  // should print true
        System.out.println(setOfCards.add(card2));  // should print true
        System.out.println(setOfCards.add(card3));  // should print true
        // ... add more cards as needed

        // Print out each Card object in the HashSet
        for (Card card : setOfCards) {
            System.out.println(card);
        }

        // Create "duplicateCard" and "uniqueCard"
        Card duplicateCard = new Card(Rank.ACE, Suit.HEART);
        Card uniqueCard = new Card(Rank.FOUR, Suit.DIAMOND);

        // Check if the HashSet contains these cards
        System.out.println(setOfCards.contains(duplicateCard)); // should print true
        System.out.println(setOfCards.contains(uniqueCard));    // should print false

        // Try adding these cards to the HashSet and verify the return value
        System.out.println(setOfCards.add(duplicateCard));  // should print false
        System.out.println(setOfCards.add(uniqueCard));     // should print true
    }
}
