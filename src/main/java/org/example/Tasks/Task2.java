package org.example.Tasks;

public class Task2 {
    public static void main(String[] args) {

        String word="IPhone 15 Pro Max";
        System.out.println("In a String presents: "+word.replaceAll("[a-z 0-9]","").length()+" alpha characters");




    }
}
