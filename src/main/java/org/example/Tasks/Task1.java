package org.example.Tasks;

public class Task1 {
    public static void main(String[] args) {

        int a=1;
        int b=2;

        System.out.println("A before swapping: "+a);
        System.out.println("B before swapping: "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("A after swapping: "+a);
        System.out.println("B after swapping: "+b);

    }
}
