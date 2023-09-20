package edu.monmouth.improvedCipher;

public class SubstitutionCipher {
    private String message;
    private String alphabetArrangement;

    public SubstitutionCipher(String message, String alphabetArrangement) {
        this.message = message;
        this.alphabetArrangement = alphabetArrangement;
    }

    public String encode() {
        StringBuilder encodedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);

            if (Character.isLetter(currentChar)) {
                char base = Character.isLowerCase(currentChar) ? 'a' : 'A';
                int index = currentChar - base;
                char encodedChar = alphabetArrangement.charAt(index);
                encodedMessage.append(encodedChar);
            } else {
                // If it's not a letter, keep it unchanged
                encodedMessage.append(currentChar);
            }
        }

        return encodedMessage.toString();
    }
}
