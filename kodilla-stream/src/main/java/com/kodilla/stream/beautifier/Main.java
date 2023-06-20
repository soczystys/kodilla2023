package com.kodilla.stream.beautifier;

public class Main {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println(poemBeautifier.beautify("text", text -> ("|" + text + "|")));
        System.out.println(poemBeautifier.beautify("text", String::toUpperCase));
        System.out.println(poemBeautifier.beautify("  text      ", String::trim));
        System.out.println(poemBeautifier.beautify("text", text -> text + text.toUpperCase()));
    }
}
