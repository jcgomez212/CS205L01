package deckOfCards;

public class LinkedStack {
    private CardNode top;

    public LinkedStack() {
        top = null;
    }

    public Card top() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty.");
        }
        return top.getCard();
    }

    public Card pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty.");
        }
        Card poppedCard = top.getCard();
        top = top.getPrevious();
        return poppedCard;
    }

    public void push(Card card) {
        CardNode newNode = new CardNode(card);
        newNode.setNext(top);
        top = newNode;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
