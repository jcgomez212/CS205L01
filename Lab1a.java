package edu.monmouth.improvedCipher;

public class Lab1a {
    public static void main(String[] args) {
        String message = "monmouth";
        String alphabetArrangement = "qazwsxedcrfvgtyhnmjuioklp";

        SubstitutionCipher cipher = new SubstitutionCipher(message, alphabetArrangement);
        String encodedMessage = cipher.encode();

        System.out.println("Encoded Message: " + encodedMessage);
    }
}
