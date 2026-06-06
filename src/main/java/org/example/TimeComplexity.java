package org.example;

public class TimeComplexity {

    public static String info() {
        return """
                Employee operations:
                - findDuplicates: O(n)
                - findUniques: O(n)
                - removeDuplicates: O(n)

                WordCounter:
                - calculateWord: O(n)

                Overall:
                - Linear time complexity using HashMap (O(n))
                """;
    }
}