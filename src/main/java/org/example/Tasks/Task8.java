package org.example.Tasks;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {

        //This code written by Natalya Pan

        ArrayList<String> word=new ArrayList<>();
        word.add("Asghar");
        word.add("Muhammad");
        word.add("Ace");
        word.add("Timmy");
        word.add("Bobby");

        for (String x:word){
            if (x.startsWith("A")) {
                System.out.println(x.toLowerCase());
            }
        }

    }
}
