package deckOfCards;

import edu.monmouth.card.*;

private CardNode head;
private CardNode tail;  // New tail attribute

public ListCardNode() {
    head = tail = null;
}

public CardNode getTail() {
    return tail;
}

public String printReverse() {
    StringBuilder sb = new StringBuilder();
    CardNode current = tail;
    while (current != null) {
        sb.append(current).append(", ");
        current = current.getPrevious();
    }
    // Removing the trailing comma and space
    if (sb.length() > 0) {
        sb.setLength(sb.length() - 2);
    }
    return sb.toString();
}

public void insertEnd(Card element) {
    CardNode newNode = new CardNode(element);
    if (tail == null) {
        head = tail = newNode;
    } else {
        tail.setNext(newNode);
        newNode.setPrevious(tail);
        tail = newNode;
    }
}

public CardNode insertAfter(Card searchValue, Card insertValue) {
    CardNode current = head;
    while (current != null && !current.getCard().equals(searchValue)) {
        current = current.getNext();
    }
    if (current != null) {
        CardNode newNode = new CardNode(insertValue);
        newNode.setNext(current.getNext());
        newNode.setPrevious(current);
        if (current.getNext() != null) {
            current.getNext().setPrevious(newNode);
        } else {
            tail = newNode; // Update the tail if inserting at the end
        }
        current.setNext(newNode);
        return newNode;
    }
    return null;
}

public CardNode remove(Card searchValue) {
    CardNode current = head;
    while (current != null && !current.getCard().equals(searchValue)) {
        current = current.getNext();
    }
    if (current != null) {
        if (current.getPrevious() != null) {
            current.getPrevious().setNext(current.getNext());
        } else {
            head = current.getNext();  // Update the head if removing from the start
        }
        if (current.getNext() != null) {
            current.getNext().setPrevious(current.getPrevious());
        } else {
            tail = current.getPrevious();  // Update the tail if removing from the end
        }
        return current;
    }
    return null;
}
}