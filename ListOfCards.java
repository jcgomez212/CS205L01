package edu.monmouth.cardList;

import edu.monmouth.card.*;

public class ListOfCards {

	public static void main(String[] args) {
		// verify constructor, toString and insert
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
		
		// new list to verify new methods
		ListCardNode list = new ListCardNode();
		System.out.println("List in reverse: " + list.printReverse());
		list.insert(new Card(Rank.ACE, Suit.CLUB));
		list.insert(new Card(Rank.KING, Suit.CLUB));
		list.insert(new Card(Rank.JACK, Suit.SPADE));
		list.insert(new Card(Rank.ACE, Suit.HEART));
		System.out.println("List after 4 cards: " + list);
		System.out.println("List in reverse: " + list.printReverse());
		
		list.insertAfter(new Card(Rank.JACK, Suit.SPADE), new Card(Rank.THREE, Suit.HEART));
		System.out.println("List after card added: " + list);
	
		list.insertEnd(new Card(Rank.FIVE, Suit.SPADE));
		System.out.println("List after card added at end: " + list);
		
		Card cardToRemove = new Card(Rank.QUEEN, Suit.CLUB);
		System.out.println(list.remove());
		System.out.println("List after attempted remove of " + cardToRemove + "\n" + list);

		cardToRemove = new Card(Rank.ACE, Suit.CLUB);
		System.out.println(list.remove());
		System.out.println("List after attempted removal of " + cardToRemove + "\n" + list);		
	}

}
