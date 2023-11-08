package deckOfCards;

public class ArrayStack {
    private Card[] stack;
    private int top;
    private int size;

    public ArrayStack() {
        this.size = 10; // Default stack size
        this.stack = new Card[size];
        this.top = -1;
    }

    public ArrayStack(int stackSize) {
        this.size = stackSize;
        this.stack = new Card[size];
        this.top = -1;
    }

    public Card top() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty.");
        }
        return stack[top];
    }

    public Card pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty.");
        }
        Card poppedCard = stack[top];
        stack[top] = null;
        top--;
        return poppedCard;
    }

    public void push(Card card) throws StackOverflowException {
        if (top == size - 1) {
            throw new StackOverflowException("Stack is full.");
        }
        stack[++top] = card;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
