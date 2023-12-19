package com.eos.java8feature;

import java.util.Arrays;
/*
* Program to count no of words in given string
* */

public class WordCount {

    public static void main(String[] args) {
        String inputString = "This is a sample sentence for word count in Java 8.";

        long wordCount = countWords(inputString);

        System.out.println("Number of words: " + wordCount);
    }

    private static long countWords(String input) {
        return Arrays.stream(input.split("\\s+")) // Split the string by whitespace
                .filter(word -> !word.isEmpty()) // Exclude empty strings
                .count(); // Count the remaining words
    }
}
