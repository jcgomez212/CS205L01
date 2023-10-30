package deckOfCards;

import edu.monmouth.card.*;

public class CardNode 
{
	private Card card;
	private CardNode next, previous;
  
  public CardNode(Card card) {
    this.card = card;
    next = previous = null;
  }
 
  public void setCard(Card card) {
	    this.card = card;
	}

	public Card getCard() {
	    return card;
	}

	public void setPrevious(CardNode link) {
	    this.previous = link;
	}

	public CardNode getPrevious() {
	    return previous;	 
	}

	public void setNext(CardNode link) {
	    this.next = link;
	}

	public CardNode getNext() {
	    return next;    
	}

	@Override 
	public String toString() {
	    return card.toString();
	}
}