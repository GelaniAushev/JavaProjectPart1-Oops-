package org.example.Tasks;

import java.util.ArrayList;
import java.util.HashSet;

public class Task10 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("ShadowHeart");
        words.add("Astarion");
        words.add("Gale");
        words.add("Astarion");
        words.add("Gale");

        HashSet<String> set=new HashSet<>(words);

        ArrayList<String> removedWords=new ArrayList<>(set);

        System.out.println("All words: "+words);
        System.out.println("Words after removing duplicates: "+removedWords);

    }
}
