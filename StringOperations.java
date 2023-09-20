package edu.monmouth.StringOperations;

public class StringOperations {
    private String inputString;

    public StringOperations(String inputString) {
        this.inputString = inputString;
    }

    public String lettersOnly() {
        if (inputString == null || inputString.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public String uppersOnly() {
        if (inputString == null || inputString.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public int numberOfVowels() {
        if (inputString == null || inputString.isEmpty()) {
            return 0;
        }

        int count = 0;
        String lowerCaseInput = inputString.toLowerCase();
        for (char c : lowerCaseInput.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public int numberOfConsonants() {
        if (inputString == null || inputString.isEmpty()) {
            return 0;
        }

        int count = 0;
        String lowerCaseInput = inputString.toLowerCase();
        for (char c : lowerCaseInput.toCharArray()) {
            if (Character.isLetter(c) && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                count++;
            }
        }
        return count;
    }

    public String reverseString() {
        if (inputString == null || inputString.isEmpty()) {
            return "";
        }

        return new StringBuilder(inputString).reverse().toString();
    }
}
