package org.example.Tasks;

public class Task6 {

    public static int countVowels(String word) {

        //This code written by Gelani Aushev

        word = "documentation";
        int vowelsCount = 0;
        for (char c : word.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static void main(String[] args) {

        String word="documentation";
        int vowels=countVowels(word);
        System.out.println("Num of vowels in "+word+" is: "+vowels);

    }
}
