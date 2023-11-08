// modified wed nov 8 23'

package edu.monmouth.cardList;

import edu.monmouth.card.*;
import deckOfCards.Card; // Import your Card class

public class ListOfCards {

    public static void main(String[] args) {
        ListCardNode fullList = new ListCardNode();
        System.out.println("Before adding cards\nnumber of Cards: " + fullList.size());
        System.out.println("isEmpty: " + fullList.isEmpty());

        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                fullList.insert(new Card(rank, suit));
            }
        }
        System.out.println(fullList);
        System.out.println("After adding cards\nnumber of Cards: " + fullList.size());
        System.out.println("isEmpty: " + fullList.isEmpty());

        ListCardNode list = new ListCardNode();
        System.out.println("List in reverse: " + list.printReverse());
        list.insert(new Card(Rank.ACE, Suit.CLUB));
        list.insert(new Card(Rank.KING, Suit.CLUB));
        list.insert(new Card(Rank.JACK, Suit.SPADE));
        list.insert(new Card(Rank.ACE, Suit.HEART));
        System.out.println("List after 4 cards: " + list);
        System.out.println("List in reverse: " + list.printReverse());

        Card cardToCount = new Card(Rank.ACE, Suit.CLUB);
        int count = list.howMany(cardToCount);
        System.out.println("Number of " + cardToCount + " in the list: " + count);

        Card cardToInsert = new Card(Rank.THREE, Suit.HEART);
        list.uniqueInsert(cardToInsert);
        System.out.println("List after card added with uniqueInsert: " + list);
        System.out.println("List in reverse: " + list.printReverse());
    }
}
