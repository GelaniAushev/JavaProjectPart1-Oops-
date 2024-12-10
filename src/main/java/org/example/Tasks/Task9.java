package org.example.Tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task9 {

    //This code written by Martin Schwarz


    // Find the First Non-Repeating Character in a String: Given a string, find and
    // return the first non-repeating character. For example, in the string
    // "abracadabra", the first non-repeating character is 'c'.

    public static void main(String[] args) {
        String s = "abracadabra";

        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for(Character c : s.toCharArray())
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

        boolean found = false;
        for (Map.Entry<Character, Integer> e : freqMap.entrySet())
            if (e.getValue() == 1) {
                System.out.println("The first non-repeating char in the word '" + s + "' is '" + e.getKey() + "'.");
                found = true;
                break;
            }
        if (!found)
            System.out.println("The word '" + s + "' does not contain any non-repeated characters.");
    }
}
