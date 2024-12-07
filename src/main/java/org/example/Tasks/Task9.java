package org.example.Tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task9 {

    public static char findFirstNonRepeatingChar(String str) {

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        String input = "abracadabra";
        char result = findFirstNonRepeatingChar(input);
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

    }
}
