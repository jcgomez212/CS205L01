package deckOfCards;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class StackTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("config.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int stackSize = Integer.parseInt(properties.getProperty("STACKSIZE"));

        ArrayStack arrayStack = new ArrayStack(stackSize);
        LinkedStack linkedStack = new LinkedStack();

        try {
            System.out.println("Pushing cards onto ArrayStack:");
            for (int i = 0; i < stackSize; i++) {
                arrayStack.push(new Card(Rank.ACE, Suit.HEART));
                System.out.println("Top card: " + arrayStack.top());
            }

            System.out.println("Pushing card onto full ArrayStack:");
            arrayStack.push(new Card(Rank.KING, Suit.CLUB));
        } catch (StackOverflowException | StackUnderflowException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Popping cards from ArrayStack:");
            while (!arrayStack.isEmpty()) {
                System.out.println("Popped card: " + arrayStack.pop());
            }

            System.out.println("Popping card from empty ArrayStack:");
            arrayStack.pop();
        } catch (StackUnderflowException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Pushing cards onto LinkedStack:");
            linkedStack.push(new Card(Rank.ACE, Suit.HEART));
            System.out.println("Top card: " + linkedStack.top());
        } catch (StackUnderflowException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Popping card from LinkedStack:");
            System.out.println("Popped card: " + linkedStack.pop());
        } catch (StackUnderflowException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
