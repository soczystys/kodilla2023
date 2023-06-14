package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
//        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
//        System.out.println(onlyVowels("Moduł 6. Wprowadzenie to testowania oprogramowania"));

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("ok");
        } else {
            System.out.println("error");
        }

        Calculator calculator = new Calculator();

        Integer calculatorResult = calculator.add(3, 6);

        if (calculatorResult.equals(9)) {
            System.out.println("ok");
        } else {
            System.out.println("error");
        }

        calculatorResult = calculator.subtract(7, 2);

        if (calculatorResult.equals(5)) {
            System.out.println("ok");
        } else {
            System.out.println("error");
        }

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
