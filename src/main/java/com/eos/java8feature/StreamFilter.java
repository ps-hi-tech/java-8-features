package com.eos.java8feature;

/*
* Create java class to
1.create list of String objects
2.count no of string whose length is >5
3.count no of empty string
4.Find empty string and store them in to new list

please perform above operation using java 8 stream features
* */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public static void main(String[] args) {
        // Create a list of String objects
        List<String> stringList = Arrays.asList("Java", "Stream", "API", "", "Lambda", "Function", "", "Optional");

        // 1. Create a list of String objects
        System.out.println("Original List: " + stringList);

        // 2. Count the number of strings whose length is > 5
        long countStringLengthGreaterThan5 = stringList.stream()
                .filter(s -> s.length() > 5)
                .count();
        System.out.println("Number of strings with length > 5: " + countStringLengthGreaterThan5);

        // 3. Count the number of empty strings
        long countEmptyStrings = stringList.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println("Number of empty strings: " + countEmptyStrings);

        // 4. Find empty strings and store them in a new list
        List<String> emptyStringList = stringList.stream()
                .filter(String::isEmpty)
                .collect(Collectors.toList());
        System.out.println("List of empty strings: " + emptyStringList);
    }
}
