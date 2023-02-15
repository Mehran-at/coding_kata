package com.kingcode;

public class StringAnalyzer {

    public static int[] Solve(String word) {
        int[] output = new int[4];

        var uppercaseCount = 0;
        var lowercaseCount = 0;
        var numberCount = 0;
        var spacialCharacterCount = 0;

        for (int letter = 0; letter < word.length(); letter++) {
            if (isUppercase(getLetter(word, letter))) uppercaseCount++;
            if (isLowercase(getLetter(word, letter))) lowercaseCount++;
            if (isSpacialCharacter(getLetter(word, letter))) spacialCharacterCount++;
            if (isNumber(getLetter(word, letter))) numberCount++;
        }

        output[0] = uppercaseCount;
        output[1] = lowercaseCount;
        output[2] = numberCount;
        output[3] = spacialCharacterCount;

        return output;

    }

    private static char getLetter(String word, int letter) {
        return word.charAt(letter);
    }

    private static boolean isUppercase(Character letter) {
        return Character.isUpperCase(letter);
    }

    private static boolean isLowercase(Character letter) {
        return Character.isLowerCase(letter);
    }

    private static boolean isNumber(Character element) {
        return Character.isDigit(element);
    }

    private static boolean isSpacialCharacter(Character letter) {
        return !isUppercase(letter) && !isLowercase(letter) && !isNumber(letter);
    }
}
