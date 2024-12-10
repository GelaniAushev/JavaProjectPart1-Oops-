package org.example.Tasks;

public class Task1 {
    public static void main(String[] args) {

        String fruit1="Apple";
        String fruit2="Banana";

        System.out.println("Fruit 1 before swapping: "+fruit1);
        System.out.println("Fruit 2 before swapping: "+fruit2);

        fruit1=fruit1+fruit2;

        fruit2=fruit1.substring(0,5);
        fruit1=fruit1.substring(5,11);

        System.out.println("Fruit 1 after swapping: "+fruit1);
        System.out.println("Fruit 2 after swapping: "+fruit2);

    }
}
