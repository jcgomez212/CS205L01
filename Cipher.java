package edu.monmouth.CaesarCipher;

public class Cipher {
    private String message;
    private int offset;

    public Cipher(String message, int offset) {
        this.message = message;
        this.offset = offset;
    }

    public String encode() {
        StringBuilder encodedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);

            if (Character.isLetter(currentChar)) {
                char base = Character.isLowerCase(currentChar) ? 'a' : 'A';
                char encodedChar = (char) (base + (currentChar - base + offset) % 26);
                encodedMessage.append(encodedChar);
            } else {
                // If it's not a letter, keep it unchanged
                encodedMessage.append(currentChar);
            }
        }

        return encodedMessage.toString();
    }

    public static void main(String[] args) {
        Cipher cipher = new Cipher("hello", 3);
        String encodedMessage = cipher.encode();
        System.out.println("Encoded Message: " + encodedMessage);
    }
}
