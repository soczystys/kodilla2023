package com.kodilla.testing;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
        System.out.println(onlyVowels("Moduł 6. Wprowadzenie to testowania oprogramowania"));

    }

    static String onlyVowels(String text) {
        String resultText = "";
        String vowels = "aeiou";
        for (Character character: text.toLowerCase().toCharArray()) {
            for (Character vowel: vowels.toCharArray()) {
                if (character.equals(vowel)) {
                    resultText += vowel;
                }
            }
        }
        return resultText;
    }
}
